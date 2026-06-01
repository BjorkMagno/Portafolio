<h1 align="center">
🤖 Predicción de Cancelación de Clientes — Telecom X
</h1>

<p align="center">
Proyecto de Machine Learning orientado al análisis y predicción de evasión de clientes (<i>Churn Prediction</i>) utilizando técnicas de procesamiento de datos, análisis estadístico y modelado predictivo.
</p>

<hr>

<h2>📌 Descripción del Proyecto</h2>

<p>
Este proyecto desarrolla un flujo completo de preparación de datos y construcción de modelos de predicción para el análisis de cancelación de clientes en <b>Telecom X</b>.
</p>

<p>
El sistema implementa un tratamiento especializado para la modelación de datos a partir de información extraída desde un archivo <code>JSON</code> obtenido mediante una URL externa. El procesamiento incluye limpieza, transformación, análisis estadístico y entrenamiento de modelos predictivos enfocados en la detección de clientes con alta probabilidad de evasión.
</p>

<p>
Además, se realiza una evaluación comparativa de modelos, análisis de correlación y multicolinealidad, exportación del mejor modelo y generación de reportes sobre las variables más relevantes asociadas a la cancelación.
</p>

<hr>

<h2>🎯 Objetivos</h2>

<ul>
  <li>Preparar y transformar datos para modelado predictivo.</li>
  <li>Identificar variables relevantes relacionadas con la cancelación de clientes.</li>
  <li>Reducir inconsistencias y ruido en el conjunto de datos.</li>
  <li>Construir modelos de Machine Learning para predicción de churn.</li>
  <li>Evaluar el rendimiento de distintos modelos predictivos.</li>
  <li>Determinar factores críticos asociados a la evasión.</li>
  <li>Generar recomendaciones basadas en resultados analíticos.</li>
</ul>

<hr>

<h2>📂 Estructura del Proyecto</h2>

<pre>
TelecomX_Modelo/
│
├── README.md
├── TelecomX_Modelo.ipynb
│
├── data/
│   └── raw/TelecomX_DataTreat.json
│
├── models/
│   └── exported/predicion_cancelacion.pkl
│
└── reports/
      └── conclusions/

</pre>

<hr>

<h2>📁 Archivos Principales</h2>

<table>
  <thead>
    <tr>
      <th>Archivo</th>
      <th>Descripción</th>
    </tr>
  </thead>

  <tbody>
    <tr>
      <td><code>TelecomX_Modelo.ipynb</code></td>
      <td>Notebook principal con el flujo de preparación, entrenamiento y evaluación del modelo.</td>
    </tr>
    <tr>
      <td><code>TelecomX_DataTreat.json</code></td>
      <td>Dataset tratado y preparado para modelado predictivo.</td>
    </tr>
    <tr>
      <td><code>modelo_exportado.pkl</code></td>
      <td>Modelo final exportado para reutilización o despliegue.</td>
    </tr>
    <tr>
      <td><code>README.md</code></td>
      <td>Documentación general del proyecto.</td>
    </tr>

  </tbody>
</table>

<hr>

<h2>⚙️ Tecnologías Utilizadas</h2>

<p align="left">

<img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white">

<img src="https://img.shields.io/badge/Pandas-150458?style=for-the-badge&logo=pandas&logoColor=white">

<img src="https://img.shields.io/badge/NumPy-013243?style=for-the-badge&logo=numpy&logoColor=white">

<img src="https://img.shields.io/badge/scikit--learn-F7931E?style=for-the-badge&logo=scikit-learn&logoColor=white">

<img src="https://img.shields.io/badge/Matplotlib-11557C?style=for-the-badge">

<img src="https://img.shields.io/badge/Seaborn-4C72B0?style=for-the-badge">

<img src="https://img.shields.io/badge/Jupyter-F37626?style=for-the-badge&logo=jupyter&logoColor=white">

</p>

<hr>

<h2>🧹 Tratamiento y Preparación de Datos</h2>

<p>
El procesamiento de datos fue diseñado específicamente para garantizar un conjunto de información adecuado para el entrenamiento de modelos predictivos.
</p>

<h3>Procesos realizados:</h3>

<ul>

  <li>Lectura de datos desde un archivo JSON mediante URL.</li>

  <li>Eliminación de columnas irrelevantes para el modelo.</li>

  <li>Tratamiento de valores nulos según proporción y relevancia.</li>

  <li>Estandarización y normalización de variables.</li>

  <li>Agrupación y reorganización de categorías.</li>

  <li>Aplicación de técnicas de Encoding para variables categóricas.</li>

  <li>Conversión y validación de tipos de datos.</li>

  <li>Balance y verificación de proporción de cancelación.</li>

</ul>

<hr>

<h2>📊 Análisis Estadístico</h2>

<p>
Antes del entrenamiento de modelos, se realizó un análisis estadístico exploratorio para identificar relaciones relevantes entre variables.
</p>

<h3>Análisis desarrollados:</h3>

<ul>

  <li>Análisis de correlación entre variables numéricas.</li>

  <li>Detección de variables relevantes para churn.</li>

  <li>Evaluación de dependencia entre características.</li>

  <li>Análisis de multicolinealidad mediante cálculo de VIF (<i>Variance Inflation Factor</i>).</li>

  <li>Selección de variables con mayor capacidad predictiva.</li>

</ul>

<hr>

<h2>🤖 Modelado Predictivo</h2>

<p>
Posteriormente se realizó la construcción y entrenamiento de modelos de Machine Learning orientados a la predicción de cancelación de clientes.
</p>

<h3>Etapas del modelado:</h3>

<ul>

  <li>Separación de datos para entrenamiento y prueba.</li>

  <li>Entrenamiento de modelos predictivos.</li>

  <li>Comparación de desempeño entre modelos.</li>

  <li>Evaluación mediante métricas de clasificación.</li>

  <li>Optimización y selección del mejor modelo.</li>

  <li>Exportación del modelo final entrenado.</li>

</ul>

<hr>

<h2>📈 Evaluación del Modelo</h2>

<p>
El rendimiento de los modelos fue evaluado utilizando métricas orientadas a clasificación binaria y predicción de churn.
</p>

<ul>

  <li>Accuracy</li>

  <li>Precision</li>

  <li>Recall</li>

  <li>F1-Score</li>

  <li>Matriz de Confusión</li>

  <li>Curva ROC-AUC</li>

</ul>

<hr>

<h2>🧠 Variables Relevantes para la Cancelación</h2>

<p>
El análisis permitió identificar variables con alta influencia en la evasión de clientes, entre ellas:
</p>

<ul>

  <li>Tipo de contrato</li>

  <li>Antigüedad del cliente</li>

  <li>Cargos mensuales</li>

  <li>Servicios adicionales contratados</li>

  <li>Servicios de seguridad y soporte</li>

  <li>Tipo de internet</li>

  <li>Métodos de pago</li>

</ul>

<hr>

<h2>💡 Recomendaciones</h2>

<ul>

  <li>Fortalecer estrategias de retención para clientes con contratos mensuales.</li>

  <li>Implementar beneficios asociados a permanencia.</li>

  <li>Promover servicios complementarios de soporte y seguridad.</li>

  <li>Analizar clientes con altos cargos mensuales.</li>

  <li>Aplicar estrategias predictivas tempranas para clientes con riesgo de churn.</li>

</ul>

<hr>

<h2>🚀 Ejecución del Proyecto</h2>

<h3>Clonar repositorio</h3>

<pre><code>
git clone https://github.com/BjorkMagno/Portafolio.git
</code></pre>

<h3>Ingresar al proyecto</h3>

<pre><code>
cd Portafolio/data-science/desafios/TelecomX_Modelo
</code></pre>

<h3>Instalar dependencias</h3>

<pre><code>
pip install pandas numpy scikit-learn matplotlib seaborn jupyter
</code></pre>

<h3>Ejecutar Notebook</h3>

<pre><code>
jupyter notebook
</code></pre>

<p>
Abrir:
</p>

<pre><code>
TelecomX_Modelo.ipynb
</code></pre>

<hr>

<h2>📚 Dataset</h2>

<p>
El conjunto de datos contiene información relacionada con:
</p>

<ul>

  <li>Datos demográficos</li>

  <li>Servicios contratados</li>

  <li>Facturación</li>

  <li>Tipo de contrato</li>

  <li>Antigüedad</li>

  <li>Métodos de pago</li>

  <li>Estado de cancelación (Churn)</li>

</ul>

<hr>

<h2>📌 Conclusión</h2>

<p>
Este proyecto implementa un flujo completo de preparación de datos y modelado predictivo para la detección de cancelación de clientes en Telecom X.
</p>

<p>
El análisis permitió identificar factores relevantes asociados a la evasión y construir modelos capaces de estimar el riesgo de cancelación, proporcionando herramientas útiles para estrategias de retención y toma de decisiones empresariales.
</p>

<hr>

<h2>👤 Autor</h2>

<p>
<b>Bjork Magno</b><br>
Proyecto de Ciencia de Datos — Telecom X Modelo Predictivo
</p>
