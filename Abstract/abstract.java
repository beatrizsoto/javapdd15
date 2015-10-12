//Clases Factoría
	public abstract class ToolsFactory {
		public abstract Tool1Processor createTool1Processor();
		public abstract Tool2FeeProcessor createTool2FeeProcessor();
	}
	public class CToolsFactory extends ToolsFactory {
		public Tool1Processor createTool1Processor() {
			return new CTool1Processor();
		}
		public Tool2FeeProcessor createTool2FeeProcessor() {
			return new CTool2FeeProcessor();
			}
	}
	public class EToolsFactory extends ToolsFactory {
		public Tool1Processor createTool1Processor() {
			return new ETool1Processor();
		}
		public Tool2FeeProcessor createTool2FeeProcessor() {
			return new ETool2FeeProcessor();
		}
	}

	//Clases Productos
	public abstract class Tool2FeeProcessor {
		abstract void calculateTool2Fee(Orden orden);
	}

	public abstract class Tool1Processor {
		abstract void calculateTool1es(Orden orden);
	}

	public class ETool2FeeProcessor extends Tool2FeeProcessor {
		public void calculateTool2Fee(Orden orden) {
		        ...
		}
	}
	
	public class CTool2FeeProcessor extends Tool2FeeProcessor {
		public void calculateTool2Fee(Orden orden) {
		        ...
		}
	}

	public class ETool1Processor extends Tool1Processor {
		public void calculateTool1es(Orden orden) {
			...
		}
	}

	public class CTool1Processor extends Tool1Processor {
		public void calculateTool1es(Orden orden) {
			...
		}
	}

        //Clases Cliente
	public class OrderProcessor {
		private Tool1Processor Tool1Processor;
		private Tool2FeeProcessor Tool2FeeProcessor;

		public OrderProcessor(ToolsFactory factory) {
			Tool1Processor = factory.createTool1Processor();
			Tool2FeeProcessor = factory.createTool2FeeProcessor();	
		}
		public void processOrder (Order order)	{
			// ....
			Tool1Processor.calculateTool1es(order);
			Tool2FeeProcessor.calculateTool2Fee(order);
			// ....
		}
	}
	
	public class Application {
		public static void main(String[] args) {
			// .....
			String code = "E";
			Customer customer = new Customer();
			Order order = new Order();
			OrderProcessor orderProcessor = null;
			ToolsFactory factory = null;
	
			if (code != "E") {
				factory = new CToolsFactory();
			} else {
				factory = new EToolsFactory();
			}
			orderProcessor = new OrderProcessor(factory);
			orderProcessor.processOrder(order);
		}
	}
