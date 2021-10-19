/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informacion;

/**
 *
 * @author Josue
 */
public class Cliente {
    
        /*  ATRIBUTOS   */
        @SuppressWarnings("FieldMayBeFinal")
        private int numPrestamo;        //Numero de Préstamo
        private String numIdentidad;    //Numero de Identidad
        private String nombre;          //Nombre del Cliente
        private String apellido1;       //Apellido Paterno
        private String apellido2;       //Apellido Materno
        private double valPrestamo;     //Valor del Préstamo
        private String fechaA;          //Fecha de Autorizació
        private String entrega;         //Fecha tentativa de Entrega
        
        
        /*  CONSTRUCTORES   */
        public Cliente(int numPrestamo, String numIdentidad, String nombre, String apellido1, String apellido2, double valPrestamo, String fechaA, String entrega) {
            this.numPrestamo = numPrestamo;
            this.numIdentidad = numIdentidad;
            this.nombre = nombre;
            this.apellido1 = apellido1;
            this.apellido2 = apellido2;
            this.valPrestamo = valPrestamo;
            this.fechaA = fechaA;
            this.entrega = entrega;
        }
        
        public Cliente() {
            this.numPrestamo = 0;
            this.numIdentidad = "";
            this.nombre = "";
            this.apellido1 = "";
            this.apellido2 = "";
            this.valPrestamo = 0.0;
            this.fechaA = "";
            this.entrega = "";
        }
        
        
        /*  SETTERS AND GETTERS */

        public int getNumPrestamo() {
            return numPrestamo;
        }

        public void setNumPrestamo(int numPrestamo) {
            this.numPrestamo = numPrestamo;
        }

        public String getNumIdentidad() {
            return numIdentidad;
        }

        public void setNumIdentidad(String numIdentidad) {
            this.numIdentidad = numIdentidad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido1() {
            return apellido1;
        }

        public void setApellido1(String apellido1) {
            this.apellido1 = apellido1;
        }

        public String getApellido2() {
            return apellido2;
        }

        public void setApellido2(String apellido2) {
            this.apellido2 = apellido2;
        }

        public double getValPrestamo() {
            return valPrestamo;
        }

        public void setValPrestamo(double valPrestamo) {
            this.valPrestamo = valPrestamo;
        }

        public String getFechaA() {
            return fechaA;
        }

        public void setFechaA(String fechaA) {
            this.fechaA = fechaA;
        }

        public String getEntrega() {
            return entrega;
        }

        public void setEntrega(String entrega) {
            this.entrega = entrega;
    }
        
        
        
        
}
