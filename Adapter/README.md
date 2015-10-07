
# Patron de diseno Adapter

Para ello añadiremos un adaptador intermedio, que se encargará de realizar la conversión de una interface a otra.

Este patrón se utiliza generalmente cuándo ya existe una interface, pero no podemos (o no queremos) usarla. Por ejemplo cuando tenemos que utilizar librerías externas.

El patrón adaptador nos permite **convertir** o **transformar** una interface existente en otra interface esperada por un cliente, para realizar determinada operación, es decir en muchas ocasiones necesitamos hacer alguna operación desde nuestras aplicaciones (cliente), y en muchos casos ya tenemos esta operación implementada en una librería de clases por ejemplo.<br /> <br /> Pero también nos podemos encontrar que la interface que usa nuestro cliente no sea compatible con la interface que usa este componente genérico que tenemos.

Es allí donde cobra importancia el patrón adaptador o adapter pattern, el cual **nos permite a través de un componente intermedio entre las dos interfaces lograr que sean compatibles** y lograr reutilizar nuestro código sin necesidad de repetirlo o acoplarlo fuertemente a alguna implementación en específico.


-Proposito
	
		-Convertir la interfaz de una clase en otra distinta que espera el cliente.
		-Permitire que un conjuto de clases con interfaces incompatibles trabajen juntas
		-Tambien conocido como Wrapper (envoltorio).

-Usa el patron adapter cuando 
	  -Quieras utilizar una clase ya existente, pero cuya interfaz no coincide con la que necesitas.
		-Quisieras crear una clase reutilizable que coopere con otras no relacionadas, es decir, con clases que puedan      no tener una interfaz compatible.
		
[imagen UML en Google Drive]

(https://drive.google.com/file/d/0B1Kh0IPlUf8rQ3owYUtacXdtUDg/view?usp=sharing)

