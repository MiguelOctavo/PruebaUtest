#Autor: Miguel Alvarez
  @stories
  Feature: Registro de un usuario en utest
    @Scenario
    Scenario: Registro de juan de la pagina de utest
      Given Juan desea registrarse en utest
      When El usuario debe diligenciar todos los datos para el registro
      |strNombre|strApellido|strEmail                   |strMes|strDia|strAño|strCiudad|strCodigoPostal|strPais |strComputador |strVersion |strLenguaje |strMovil |strModelo |strOs     |strContraseña     |strContraseñaConfirmar     |
      |Nombre   |Apellido   |CorreoElectronico@gmail.com|June  |22    |1990  |Sincelejo|700001         |Colombia|Windows       |10         |Arabic      |Apple    |iPhone 4  |iOS 11.2.6|123456789/*-      |123456789/*-               |
      Then El registro de completa cuando el usuario ve el boton Complete Setup
        |strTextoBotonFinal|
        |Complete Setup|