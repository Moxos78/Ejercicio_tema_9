public class Main {
    public static void main(String[] args) {

        Cliente juan=new Cliente();
        juan.setEdad(30);
        juan.setNombre("Juan Carlos Martinez");
        juan.setTelefono("+584 15454547");
        juan.setCredito(10214.5);
        System.out.println("Nombre: "+juan.getNombre());
        System.out.println("Edad: "+juan.getEdad());
        System.out.println("Telefono: "+juan.getTelefono());
        System.out.println("Credito: "+juan.getCredito());

        System.out.println("----------------------------------------");
        Trabajador pedro=new Trabajador();
        pedro.setEdad(25);
        pedro.setNombre("Pedro Sanchez");
        pedro.setTelefono("+584 4564564");
        pedro.setSalario(2500);
        System.out.println("Nombre: "+pedro.getNombre());
        System.out.println("Edad: "+pedro.getEdad());
        System.out.println("Telefono: "+pedro.getTelefono());
        System.out.println("Credito: "+pedro.getSalario());



    }
}