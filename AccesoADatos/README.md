# Proyecto de Gestión en Java

## **Descripción General**
Este proyecto es una aplicación en Java destinada a la gestión de datos y operaciones relacionadas con usuarios, empleados, coches, ventas y flujos de datos. Combina el uso de bases de datos relacionales (MySQL) y NoSQL (MongoDB), manipulación de archivos, y procesamiento de datos JSON para ofrecer un conjunto amplio de funcionalidades.

## **Estructura del Proyecto**
La estructura del proyecto es la siguiente:

```
Proyecto/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── controller/         # Controladores de lógica de negocio
│   │   │   │   ├── Concesionario.java
│   │   │   │   ├── GestionFlujos.java
│   │   │   │   ├── GestorFicheros.java
│   │   │   │   ├── GestorFicherosConjuntos.java
│   │   │   │   ├── GestorFicherosLectura.java
│   │   │   │   ├── GestionFicherosEscritura.java
│   │   │   ├── dao/                # Clases de acceso a datos
│   │   │   │   ├── UsuariosDAO.java
│   │   │   │   ├── UsuarioDAO.java
│   │   │   │   ├── CochesDAO.java
│   │   │   │   ├── EmpleadoDAO.java
│   │   │   │   ├── VentaDAO.java
│   │   │   ├── database/           # Conexiones a bases de datos
│   │   │   │   ├── MongoDBConnection.java
│   │   │   │   ├── DBConnecion.java
│   │   │   │   ├── DBScheme.java
│   │   │   │   ├── SchemaDB.java
│   │   │   ├── model/              # Clases de modelo (POJO)
│   │   │   │   ├── Usuario.java
│   │   │   │   ├── Empleado.java
│   │   │   │   ├── Coche.java
│   │   │   │   ├── Venta.java
│   │   │   │   ├── Tipo.java
│   │   │   │   ├── Producto.java
│   │   │   │   ├── Tienda.java
│   │   │   ├── main/               # Clases principales
│   │   │   │   ├── Entrada.java
│   │   │   │   ├── EntradaMongo.java
│   │   │   │   ├── EntradaJSON.java
│   │   │   │   ├── EntradaFlujos.java
│   │   ├── resources/              # Archivos de recursos
│   │   │   ├── ejemplo_dudas.txt
│   │   │   ├── ejemplo_dudas.bin
│   │   │   ├── ejemplo_dudas.obj
│   │   │   ├── productos.txt
│   ├── test/                       # Clases de pruebas
├── lib/                            # Librerías externas necesarias
├── docs/                           # Documentación
├── dist/                           # Compilados finales
├── config/                         # Configuraciones específicas
└── README.md                       # Documentación principal del proyecto
```

## **Requisitos Previos**
- JDK 17 o superior
- MySQL
- MongoDB
- IDE de desarrollo (IntelliJ IDEA, Eclipse, o NetBeans)
- Conexión a Internet para peticiones JSON
- Librerías externas:
  - `mysql-connector-java`
  - `mongo-java-driver` o `mongodb-driver-sync`
  - `org.json` y `Gson` (para manejo de JSON)

## **Funcionalidades Principales**
### 1. **Gestor de Usuarios y Empleados**
- **UsuariosDAO**: CRUD sobre usuarios en MongoDB.
- **UsuarioDAO**: CRUD sobre usuarios en MySQL.
- **EmpleadoDAO**: Gestión de empleados con categorías (`Tipo`).

### 2. **Gestión de Coches y Ventas**
- **CochesDAO**: Agregar, listar y filtrar coches por marca o precio.
- **VentaDAO**: Registrar ventas.
- **Concesionario**: Centraliza las operaciones relacionadas con empleados, coches y ventas.

### 3. **Flujos de Datos y Archivos**
- **GestionFlujos**: Lectura y escritura de datos binarios, texto plano y objetos serializables.
- **GestorFicheros**: Administración de flujos de datos binarios y objetos.
- **GestorFicherosLectura**: Exploración recursiva de directorios y lectura de texto.
- **GestorFicherosConjuntos**: Cifrado y descifrado de mensajes.

### 4. **Procesamiento de JSON**
- **PeticionJSON**:
  - Consulta de una API JSON.
  - Filtro y exportación de productos.
  - Funcionalidades de búsqueda y filtrado por ID o rango de precios.

## **Cómo Ejecutar el Proyecto**
1. **Configura la Base de Datos**:
   - Importa el esquema de MySQL disponible en `docs/schema.sql`.
   - Configura las credenciales en las clases `DBConnecion` y `MongoDBConnection`.

2. **Ejecuta las Clases Principales**:
   - **Entrada.java**: Punto de entrada general.
   - **EntradaMongo.java**: Funciones de MongoDB.
   - **EntradaJSON.java**: Procesamiento JSON.
   - **EntradaFlujos.java**: Gestión de flujos de datos.

3. **Pruebas**:
   - Usa las clases de prueba en el paquete `test`.

## **Ejemplos de Uso**
### 1. Registrar un Usuario:
```java
UsuariosDAO usuariosDAO = new UsuariosDAO();
Usuario usuario = new Usuario("Nombre", "Apellido", "correo@gmail.com", 30);
usuariosDAO.insertarUsuario(usuario);
```

### 2. Filtrar Coches por Precio:
```java
CochesDAO cochesDAO = new CochesDAO();
ArrayList<Coche> coches = cochesDAO.getCochePrecio(20000);
for (Coche coche : coches) {
    coche.mostrarDatos();
}
```

### 3. Consultar API JSON:
```java
PeticionJSON peticionJSON = new PeticionJSON();
peticionJSON.procesarPeticion();
```

## **Futuras Mejoras**
- Agregar soporte para interfaz gráfica usando JavaFX o Swing.
- Integrar un sistema de autenticación para el acceso.
- Documentación más detallada sobre errores comunes.

## **Autores**
Este proyecto fue desarrollado como una herramienta educativa para explorar múltiples aspectos de la programación en Java.

