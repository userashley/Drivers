# Formula 1 Driver-Contructor Results

Esta aplicación JavaFX permite visualizar los resultados de los conductores y constructores de Formula 1 en dos `TableView` distintos, basados en los datos obtenidos de una base de datos PostgreSQL. Los usuarios pueden seleccionar un año específico desde un `ComboBox` y los resultados correspondientes se mostrarán en la tabla correspondiente.

## Características

- Selección entre visualizar resultados de conductores o de constructores.
- Selección de año mediante un `ComboBox`.
- Visualización de resultados en un `TableView` con las siguientes columnas:
- Para conductores: `DriverName`, `Wins`, `TotalPoints`, `Rank`.

## Requisitos
- Java .
- MySQL.
- Librerías de JavaFX.

## Configuración de la Base de Datos

1. Instala MySql y crea una base de datos en phpMyAdmin  llamada `Proyecto1`.
2. Asegúrate de tener las siguientes tablas y datos en tu base de datos:
    - `drivers`
    - `races`
    - `results`
    - `seasons`
## Instalación
Configura las credenciales de la base de datos en las clases `DriverResultRepository`.

    String url="jdbc:mysql://127.0.0.1:3306/proyecto1";
    String usuario="ashley";
    String contrasenia="Ashley/523_5";
    ``` 
## Estructura del Proyecto

- `Main.java`: Clase principal que inicia la aplicación y muestra la ventana principal para seleccionar entre conductores y constructores.
- `DriverResultsWindow.java`: Clase que crea la ventana con el `TableView` para mostrar los resultados de los conductores.
- `ConstructorResultsWindow.java`: Clase que crea la ventana con el `TableView` para mostrar los resultados de los constructores.
- `Repositories/DriverResultRepository.java`: Clase que maneja la conexión a la base de datos y las consultas de resultados de los conductores.
- `Repositories/ConstructorRepository.java`: Clase que maneja la conexión a la base de datos y las consultas de resultados de los constructores.
- `Repositories/SeasonRepository.java`: Clase que maneja la conexión a la base de datos y las consultas de temporadas.
- `Models/DriverResult.java`: Clase modelo para los resultados de los conductores.
- `Models/ConstructorResult.java`: Clase modelo para los resultados de los constructores.
- `Models/Season.java`: Clase modelo para las temporadas.
## Uso
1. Ejecuta la aplicación.
2. Selecciona "View Driver Results" o "View Constructor Results" en la ventana principal.
3. Selecciona un año desde el `ComboBox`.
4. Los resultados se mostrarán en el `TableView` correspondiente.
## Capturas de la ejecución de la App:
![EJCUCIÓN APP](https://github.com/MaRl0N4/Resultado-Conductores-Y-Constructores/blob/b5b712a1a27501ff5378e2a99e6e46ebf9f252e1/Captura%20de%20pantalla%20(482).png)
![EJCUCIÓN APP](https://github.com/MaRl0N4/Resultado-Conductores-Y-Constructores/blob/b5b712a1a27501ff5378e2a99e6e46ebf9f252e1/Captura%20de%20pantalla%20(483).png)
![EJCUCIÓN APP](https://github.com/MaRl0N4/Resultado-Conductores-Y-Constructores/blob/b5b712a1a27501ff5378e2a99e6e46ebf9f252e1/Captura%20de%20pantalla%20(484).png)
