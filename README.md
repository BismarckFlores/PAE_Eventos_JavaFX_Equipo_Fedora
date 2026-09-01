# Eventos y controles JavaFX — Equipo Fedora
## Integrantes

| Integrante             | GitHub                                               | Correo               |
|------------------------|------------------------------------------------------|----------------------|
| Bismarck Flores        | [@BismarckFlores](https://github.com/BismarckFlores) | bjflores@uamv.edu.ni |
| Francisco Cuadra       | [@FCuadra-JAG](https://github.com/FCuadra-JAG)       | _(pendiente)_        |

## Retos implementados

| #  | Caso                   | Eventos y controles                                                                                                          |
|----|------------------------|------------------------------------------------------------------------------------------------------------------------------|
| 01 | Inventario de pulpería | `ActionEvent` para guardar productos, `KeyEvent` con `ENTER` para buscar por código, validación de campos vacíos y numéricos |
| 02 | Recepción de café      | `TableView` de lotes, `MouseEvent` para mostrar detalles, `ContextMenu` para editar y eliminar, `Alert` de confirmación      |
| 03 | Tienda de artesanías   | `MenuBar` (Catálogo, Ventas, Ayuda), `ToolBar` (Nuevo, Guardar, Buscar), `TableView` con imágenes                            |

## Estructura del proyecto

```
src/main/java/com/uam/paejavafxeventos/
├── Launcher.java              punto de entrada para el IDE
├── MainApplication.java       clase Application, carga el menú principal
├── MainController.java        navegación hacia cada reto
├── controller/                controladores de cada reto
├── model/                     entidades (Producto, LoteCafe, Artesania)
├── dao/                       acceso a datos
├── interfaces/                interfaces propias del proyecto
│   └── Dao.java               contrato genérico Dao<T, ID>
└── util/                      alertas, validaciones y navegación

src/main/resources/com/uam/paejavafxeventos/
├── view/                      vistas FXML
├── css/app.css                hoja de estilos
└── images/                    imágenes del catálogo de artesanías
```