package org.example;

public class Main {
    public static void main(String[] args) {
        // Creamos una instancia de PersonaCRUD para interactuar con la base de datos
        PersonaCRUD personaCRUD = new PersonaCRUD();

        // Insertar personas
        personaCRUD.insertarPersona("Luis", 22, "Jutiapa");
        personaCRUD.insertarPersona("Sergio", 23, "Jutiapa");

        // Mostrar personas
        System.out.println("Personas:");
        personaCRUD.mostrarPersonas();

        // Actualizar persona
        personaCRUD.actualizarPersona("Luis", "Luis Garcia");

        // Mostrar personas actualizadas
        System.out.println("\nPersonas después de la actualización:");
        personaCRUD.mostrarPersonas();

        // Eliminar persona
        personaCRUD.eliminarPersona("Sergio");

        // Mostrar personas después de eliminar
        System.out.println("\nPersonas después de la eliminación:");
        personaCRUD.mostrarPersonas();
    }
}