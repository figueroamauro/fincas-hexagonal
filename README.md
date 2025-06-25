# Aplicación para gestionar el alquiler de fincas

### Ejecución:
- Paso 1: Crear un schema llamado "fincas" en SqlServer
- Paso 2: Modificar el archivo application.properties con las credenciales de tu usuario de sql(las de flyway también).
  - <code>spring.datasource.username=TU_USAURIO</code>
  - <code>spring.datasource.password=TU_PASSWORD</code>
  - <code>spring.flyway.user=TU_USAURIO</code>
  - <code>spring.flyway.password=TU_PASSWORD</code>
- Paso 3: Ejecutá el programa y flyway te crea todas las tablas con el script que tiene configurado :D
