
/**
 * Write a description of class MVC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

 
 
public class Modelo {
 
 private Double moneda;
 private Double cantidad;
 private Double resultado;
 
 public void setMoneda(Double moneda) {
  this.moneda = moneda;
 }
 public void setCantidad(Double cantidad) {
  this.cantidad = cantidad;
 }
 public Double getResultado() {
  return resultado;
 }
 public void convetirDolarAPeso() {
  resultado = cantidad * moneda;
 }
 public void convertirPesoADolar() {
  resultado = cantidad * moneda;
 }
}


package mvc;
 
import java.awt.BorderLayout;
import java.awt.FlowLayout;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class Vista extends JFrame{
 public JButton pesos, dolares;
 private JPanel panelB, panelR;
 public JLabel lResultado;
 public JTextField campoTexto;
 
 public Vista() {
  getContentPane().setLayout(new BorderLayout());
   
  panelB = new JPanel();
  panelB.setLayout(new FlowLayout());
   
  panelR = new JPanel();
  panelR.setLayout(new FlowLayout());
   
  pesos = new JButton("Convertir a Pesos");
  dolares = new JButton("Convertir a Dolares");
   
  lResultado = new JLabel("Resultado:");
  campoTexto = new JTextField(20);
   
  panelB.add(pesos);
  panelB.add(dolares);
   
  panelR.add(lResultado);
   
  add(campoTexto, BorderLayout.NORTH);
  add(panelB, BorderLayout.SOUTH);
  add(panelR, BorderLayout.CENTER);
 }
}



    Crear cuenta nueva
    Solicitar nueva contraseña

Navegación

    Blogs
        Categorias
    Contenido
    Foros de Discusión
    Encuestas
    Tips
    Usuarios
    Envíos recientes

Temas nuevos

    cambiar un string a entero
    ¿Qué está pasando?
    Tareas Programadas

more
En línea
En este momento hay 2 usuarios y 164 invitados en línea.
Usuarios en línea

    hackchan
    OscarRyz

Comentarios recientes

    Puedes construir dos
    hace 27 mins 48 segs
    gracias por la informacion
    hace 1 hora 6 mins
    Duda
    hace 1 hora 28 mins
    gracias jpaul por la
    hace 3 horas 38 mins
    Estás usando: setString
    hace 4 horas 11 mins
    ejemplo
    hace 4 horas 50 mins
    Re: cambiar un string a entero
    hace 5 horas 16 mins
    Gracias
    hace 5 horas 49 mins
    InputStream.available regresa
    hace 6 horas 22 mins
    buffered streams
    hace 6 horas 32 mins

Encuesta
¿Qué lenguaje alternativo para la JVM te llama más la atención?:
Groovy
Scala
Clojure
JRuby
Jython
Otro... (menciona cuál)
Contenido popular
Hoy:

    llamar a un metodo que esta en una clase hacia otra clase
    Estructura de datos java (Listas simplemente enlazadas) Primer aporte
    Actualizado -- Ejemplo de WebService con Base de Datos -- Resuelto a la mitad
    comportamiento erratico
    Tareas Programadas


Siempre:

    Estructura de datos java (Listas simplemente enlazadas) Primer aporte
    Como programar en java Deitel & Deitel 7ma Edicion
    Cargar una imagen en un JPanel en netbeans
    como generar un archivo txt en java
    Problema para comparar valores null, vacio o "" de un h:inputtext


Últimas impresiones:

    JDBC simple con Spring
    Configuracion tapestry + eclipse + weblogic
    Aplicacion Con Acceso a Bases de Datos Java MySql y Patrones de Diseño Parte 2
    Imprimir año en formato calendario (ejercicio)
    Varianza, Covarianza y Contravarianza

Agradecemos el apoyo de:

IntelliJ IDEA

Sintel TI

Aplicando MVC en Java
Submitted by Jose Manuel on Vie, 12/30/2011 - 23:21

    Java Standard Edition

Hace unos días lei sobre los patrones de diseño y observe que hay muchos, demasiados. Pero también note que uno es usualmente usado en Java y en la web. Es el patrón de diseño MVC o Modelo Vista Controlador. Este me intereso por sus características, en el que separas los mecanismos de el programa en tres partes, de manera que obtienes una abstracción de la funcionalidad de tu/tus aplicaciones.

Estaba tan emocionado, porque como una de las ventajas de este patrón es que, para ciertos eventos o casos específicos puedes reutilizar código sin necesidad de hacer cambios, sobre todo en la funcionalidad. O como dice la teoría, en el Modelo. Dándote la capacidad de utilizarlo en diferentes aplicaciones.

No quiero meter teoría, ya que aquí hay demasiados buenos programadores, así es que nada mas vamos a el ejemplo.

Para ir agarrándole la onda a eso del MVC me hice un problema simple.
Digamos que nos encargan realizar un programa que convierta una cantidad a pesos(MXN) y a Dolares(USD).
Entonces una ves que definí el algoritmo de solución. Que no era mas que  moneda * cantidad
Me dispuse a crear las clases que implementarían el patrón.

La clase Modelo:
package mvc;
 
public class Modelo {
 
 private Double moneda;
 private Double cantidad;
 private Double resultado;
 
 public void setMoneda(Double moneda) {
  this.moneda = moneda;
 }
 public void setCantidad(Double cantidad) {
  this.cantidad = cantidad;
 }
 public Double getResultado() {
  return resultado;
 }
 public void convetirDolarAPeso() {
  resultado = cantidad * moneda;
 }
 public void convertirPesoADolar() {
  resultado = cantidad * moneda;
 }
}

La clase Vista
package mvc;
 
import java.awt.BorderLayout;
import java.awt.FlowLayout;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class Vista extends JFrame{
 public JButton pesos, dolares;
 private JPanel panelB, panelR;
 public JLabel lResultado;
 public JTextField campoTexto;
 
 public Vista() {
  getContentPane().setLayout(new BorderLayout());
   
  panelB = new JPanel();
  panelB.setLayout(new FlowLayout());
   
  panelR = new JPanel();
  panelR.setLayout(new FlowLayout());
   
  pesos = new JButton("Convertir a Pesos");
  dolares = new JButton("Convertir a Dolares");
   
  lResultado = new JLabel("Resultado:");
  campoTexto = new JTextField(20);
   
  panelB.add(pesos);
  panelB.add(dolares);
   
  panelR.add(lResultado);
   
  add(campoTexto, BorderLayout.NORTH);
  add(panelB, BorderLayout.SOUTH);
  add(panelR, BorderLayout.CENTER);
 }
}

La clase Controlador:
package mvc;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JFrame;
 
public class Controlador implements ActionListener {
 private Modelo modelo;
 private Vista vista;
 private Double cantidad;
 
 public Controlador(Modelo modelo, Vista vista) {
  this.modelo = modelo;
  this.vista = vista;
   
  this.vista.pesos.addActionListener(this);
  this.vista.dolares.addActionListener(this);
 }
 public void iniciarVista() {
  vista.setTitle("Conversor");
  vista.pack();
  vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  vista.setLocationRelativeTo(null);
  vista.setVisible(true);
 }
 public void actionPerformed(ActionEvent evento) {
  if(vista.pesos == evento.getSource()) {
   if(!"".equals(vista.campoTexto.getText())) {
    try{
     cantidad = Double.parseDouble(vista.campoTexto.getText());
     modelo.setCantidad(cantidad);
     modelo.setMoneda(13.943);
     modelo.convetirDolarAPeso();
     vista.lResultado.setText(modelo.getResultado().toString());
    }catch(NumberFormatException e) {
     vista.lResultado.setText("Introduzca una cantidad valida...");
    }
   }
  }
  else if(vista.dolares == evento.getSource()) {
   if(!"".equals(vista.campoTexto.getText())) {
    try{
     cantidad = Double.parseDouble(vista.campoTexto.getText());
     modelo.setCantidad(cantidad);
     modelo.setMoneda(0.072);
     modelo.convertirPesoADolar();
     vista.lResultado.setText(modelo.getResultado().toString());
    }catch(NumberFormatException e) {
     vista.lResultado.setText("Introduzca una cantidad valida...");
    }
   }
  }
 }
}

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
 
import mvc.Controlador;
import mvc.Modelo;
import mvc.Vista;
 
public class PruebaConversor {
 public static void main(String arf[]) {
  try {
   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
  }
  catch (UnsupportedLookAndFeelException e) {
  }
  catch (ClassNotFoundException e) {
  }
  catch (InstantiationException e) {
  }
  catch (IllegalAccessException e) {
  }
  Modelo modelo = new Modelo();
  Vista vista = new Vista();
  Controlador controlador = new Controlador(modelo, vista);
  controlador.iniciarVista();
 }
}