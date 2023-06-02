public class Principal {
    public static void main(String[] args) {
        Principal principal= new Principal();
        principal.inicializar();
    }
    public void inicializar() {
            // Crear una instancia de Empresa
            Empresa empresa = new Empresa();
            empresa.setNombre("TurBus");
            CiudadDestino ciudadDestino = new CiudadDestino();
            ciudadDestino.setNombre("Temuco");

            // Agregar buses a la empresa
            empresa.agregarBus("AB VC 89");
            empresa.agregarBus("CK DG 78");
            empresa.agregarBus("KJ DP 23");

            // Agregar conductores a la empresa
            empresa.agregarConductor("21288862-1");
            empresa.agregarConductor("12758345-8");

        // Crear instancias de CiudadDestino
        CiudadDestino ciudadDestino1 = new CiudadDestino();
        ciudadDestino1.setNombre("Temuco");

        CiudadDestino ciudadDestino2 = new CiudadDestino();
        ciudadDestino2.setNombre("Loncoche");

        // Crear instancias de Viajes
        Viajes viaje1 = new Viajes();
        viaje1.setId(1);
        viaje1.setDestino(ciudadDestino1);

        Viajes viaje2 = new Viajes();
        viaje2.setId(2);
        viaje2.setDestino(ciudadDestino2);

        // Asociar viajes a buses en la empresa
        empresa.viajesAsociados(viaje1, "AB VC 89");
        empresa.viajesAsociados(viaje2, "CK DG 78");

        // Eliminar un bus de la empresa
        empresa.eliminarBus("KJ DP 23");

            // Eliminar un bus de la empresa
            empresa.eliminarBus("KJ DP 23");
            //Datos empresa
            empresa.setDireccion("115 Anibal Pinto");
            empresa.setRedes("Facebook, Twitter y Instagram disponibles");
            empresa.setRut("GH DK 87");
            // Mostrar información de la empresa
            System.out.println("Nombre de la empresa: " + empresa.getNombre());
            System.out.println("Cantidad de buses: " + empresa.getCantidadBuses());
            System.out.println("RUT de la empresa: " + empresa.getRut());
            System.out.println("Dirección de la empresa: " + empresa.getDireccion());
            System.out.println("Redes de la empresa: " + empresa.getRedes());

            // Mostrar información de los buses en la empresa
            System.out.println("Buses en la empresa:");
            for (Buses bus : empresa.buses) {
                System.out.println("Patente: " + bus.getPatente());
            }

            // Mostrar información de los conductores en la empresa
            System.out.println("Conductores en la empresa:");
            for (Conductores conductor : empresa.conductores) {
                System.out.println("RUT: " + conductor.getTipoLicencia());
            }
                }
            }
