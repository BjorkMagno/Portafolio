# Analisis para la venta de una tienda.

## Objetivo y decripción.
El objetuvo es crear un programa para analizar los datos, mostrarlos visulamente y con base en ellos tomar la mejor deción para saber que tienda es mejor vender

Para tomar una desición se realizo un codigo mediante la paquetería pandas para analizar los archivos cvs con los datos de cada tienda, compras, categoría, costo, producto, carece de datos de fabricación, prodcucción y lote. No obstante, para el analisis se crearon diferentes funcióndes para el calculo de ingresos totales, costo de envio medio, ingresos brutos, ventas totales, ventas max y min, ingreso min y max por categoría y producto. Funciones para la representación grafica de los datos asi como para la creacion de tablas de porcentajes.

Pensado en los costos de envio como un costo realizado por la tienda se obtuvo un ingreso bruto que puede despreciarse en caso de ser un costo extra para el cliente donde su enfoque será el descontento del cliente visto en el costo de envio medio. Así mismo se realizo la recopilacón en tablas y se mostro visualmente los resultado en grafícas con un analisis de la desición final.

1. La función de ingresos totales, suma el precio de todos los productos vendidos.
2. La función de ventas totales, cuenta los productos vendidos.
3. La funcíon de ventas por categoría (resp. producto) cuenta las ventas que se obtuvieron por categoría (resp. producto).
4. La funcíon de ingresos por categoría (resp. producto) suma el precio de la venta por categoría (resp. producto).
5. La función de costo de envió medio calcula la media del costo de envio de la tienda, es decir, nos dice en promedio cuanto cuesta el costo de envio de un producto de cada tienda.
6. La función de calificación media calcula la media de la calificación de la tienda, es decir, nos dice en promedio la satisfación de cliente por cada producto de cada tienda.

## Ejemplo de las graficas usadas.

[Grafica de Barras](challenge-para-decidir-venta/images/grafo-barras.png)

[Grafica de Pie](challenge-para-decidir-venta/images/grafo-pie.png)

[Grafica de distribución](challenge-para-decidir-venta/images/grafo-distribucion.png)

## Instrucciones de copilación.

Recomedamos ejecutar en orden, primero la importación de datos, preparación para recapitulación de daos, análisis de facturación Ventas por categoría, calificación promedi de la tienda, productos más y menos vendidos, envío prommedio por tieda, locación, analisis para graficos o tablas, gráficas y por último el informe. Recuerde de cada sección copilar primero las funciones, y despues el ingreso de la información.

Si lo prefiere copile la importacion de paqueterías, primero la funciones, despues las variables globales y al final en el mismo orden mencionado anteriormente las recopilacion de la informacion en las tablas.
