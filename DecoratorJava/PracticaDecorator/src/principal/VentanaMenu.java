package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import componentes.Combo;
import componentes.ComboBasico;
import componentes.ComboEspecial;
import componentes.ComboFamiliar;
import decoradores.Carne;
import decoradores.Papas;
import decoradores.Queso;
import decoradores.Tomate;


/**
 * Clase GUI, es la ventana interfaz de 
 * usuario, en la que se permite la seleccion de
 * un combo y el calculo de su valor con o sin adicionales
 * @author chenao
 *
 */
public class VentanaMenu extends JFrame implements ActionListener{
	
	JLabel titulo,adicionales;
	JComboBox combos;
	String arregloCombos[] = { "Seleccione","Combo Basico", 
			"Combo Familiar", "Combo Especial" };
	JTextArea area;
	private JScrollPane scroll;
	JTextArea area2;
	private JScrollPane scroll2;
	JButton aceptar,cancelar;
	JCheckBox tomate,papas,carne,queso;
	
	public VentanaMenu()
	{
	  tomate= new JCheckBox();
	  tomate.setText("Tomate");
	  tomate.setBounds(190, 30, 70, 25);
	  tomate.setEnabled(false);
	  
	  papas= new JCheckBox();
	  papas.setText("Papas");
	  papas.setBounds(280, 30, 70, 25);
	  papas.setEnabled(false);
		
	  carne= new JCheckBox();
	  carne.setText("Carne");
	  carne.setBounds(190, 50, 70, 25);
	  carne.setEnabled(false);
	  
	  queso= new JCheckBox();
	  queso.setText("Queso");
	  queso.setBounds(280, 50, 70, 25);
	  queso.setEnabled(false);
	  
	  aceptar=new JButton();
	  aceptar.setText("Enviar Pedido");
	  aceptar.setBounds(70, 320, 150, 25);
	  
	  cancelar=new JButton();
	  cancelar.setText("Salir");
	  cancelar.setBounds(230, 320, 90, 25);
		
	  titulo= new JLabel();
	  titulo.setText("MENU COMBOS");
	  titulo.setBounds(20, 10, 150, 25);
	  
	  adicionales= new JLabel();
	  adicionales.setText("Seleccione los Adicionales");
	  adicionales.setBounds(195, 10, 180, 25);
	  
	  combos= new JComboBox();
	  combos.setBounds(20, 40, 150, 25);
	  combos.setModel(new javax.swing.DefaultComboBoxModel(arregloCombos));
	  combos.addActionListener(this);
	  
	  scroll = new JScrollPane();
	  area = new JTextArea();
		area.setEditable(false);
		area.setFont(new java.awt.Font("Verdana", 0, 12));
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setBorder(javax.swing.BorderFactory.createBevelBorder(
				javax.swing.border.BevelBorder.LOWERED, null, null, null,
				new java.awt.Color(0, 0, 0)));
		scroll.setViewportView(area);
		scroll.setBounds(20, 90, 340, 60);
		
		scroll2 = new JScrollPane();
		  area2 = new JTextArea();
			area2.setEditable(false);
			area2.setFont(new java.awt.Font("Verdana", 0, 12));
			area2.setLineWrap(true);
			area2.setWrapStyleWord(true);
			area2.setBorder(javax.swing.BorderFactory.createBevelBorder(
					javax.swing.border.BevelBorder.LOWERED, null, null, null,
					new java.awt.Color(0, 0, 0)));
			scroll2.setViewportView(area2);
			scroll2.setBounds(20, 152, 340, 160);
	 
			
	  combos.addActionListener(this);
	  aceptar.addActionListener(this);
	  cancelar.addActionListener(this);
	  tomate.addActionListener(this);
	  queso.addActionListener(this);
	  carne.addActionListener(this);
	  papas.addActionListener(this);

	  add(queso);		
	  add(carne);
	  add(papas);		
	  add(tomate);
	  add(cancelar);
	  add(aceptar);
	  add(scroll);
	  add(scroll2);
	  add(adicionales);
	  add(titulo);
	  add(combos);
	  
	  setSize(400,390);
	  setTitle("Patron Decorator");
	  setLocationRelativeTo(null);
	  setLayout(null);

	}



	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==aceptar)
		{
			if (combos.getSelectedIndex()==1) 
			{
				Combo comboBasico=new ComboBasico();
				area.setText(comboBasico.getDescripcion());
				enviarPedido(comboBasico);
			}
			else if (combos.getSelectedIndex()==2) 
			{
				Combo comboFamiliar=new ComboFamiliar();
				area.setText(comboFamiliar.getDescripcion());
				enviarPedido(comboFamiliar);
			}
			else if (combos.getSelectedIndex()==3) 
			{
				Combo comboEspecial=new ComboEspecial();
				area.setText(comboEspecial.getDescripcion());
				enviarPedido(comboEspecial);
			}
			else{
				JOptionPane.showMessageDialog(null, "No ha realizado " +
						"ningun pedido","Advertencia!!!",JOptionPane.WARNING_MESSAGE);
			}
		}
		if (e.getSource()==cancelar)
		{
			System.exit(0);
		}
		if (e.getSource()==combos)
		{
			verificaSeleccion();
			
		}
	}

	/**
	 * Aplicamos conceptos de polimorfismo para definir
	 * la porcion del combo seleccinado y luego
	 * se envia al area2 correspondiente a la del envio
	 * definido por el usuario
	 * @param combo
	 */
	private void enviarPedido(Combo combo)
	{
			if (queso.isSelected())
			{
				combo=new Queso(combo);
			}
			if (carne.isSelected())
			{
				combo=new Carne(combo);
			}
			if (papas.isSelected())
			{
				combo=new Papas(combo);
			}
			if (tomate.isSelected())
			{
				combo=new Tomate(combo);
			}
		area2.setText("Su Pedido: \n"+combo.getDescripcion()+"\n\n" +
				"Valor:\n $"+combo.valor());	
	}

	/**
	 * Valida la seleccion realizada y envia la correspondiente
	 * descripcion al area de texto
	 */
	private void verificaSeleccion() {
		if (combos.getSelectedIndex()!=0)
		{
			habilitar(true);
			if (combos.getSelectedIndex()==1) 
			{
				area.setText("Porcion de Papas Fritas, salsa, queso," +
						" hamburguesa sencilla, gaseosa");
				area2.setText("");
			}
			else if (combos.getSelectedIndex()==2) 
			{
				area.setText("Doble Porcion de Papas Fritas,salsa,doble queso," +
						" hamburguesa Familiar,doble tomate, gaseosa");
				area2.setText("");
			}
			else if (combos.getSelectedIndex()==3) 
			{
				area.setText("Doble Porcion de Papas Fritas,3 tipos de salsa," +
						" doble queso, hamburguesa Especial Doble Carne," +
						" Doble tomate, gaseosa");
				area2.setText("");
			}
			
		}
		else{
			area.setText("");
			area2.setText("");
			habilitar(false);
		}
			
	}



	private void habilitar(boolean b) 
	{
		tomate.setEnabled(b);
		queso.setEnabled(b);
		carne.setEnabled(b);
		papas.setEnabled(b);
		tomate.setSelected(false);
		queso.setSelected(false);
		carne.setSelected(false);
		papas.setSelected(false);
	}


}
