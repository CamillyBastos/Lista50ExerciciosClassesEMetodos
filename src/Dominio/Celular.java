package Dominio;

public class Celular {
        public String marca;
        public String modelo;
        public int armazenamento;
        public double preco;

        public boolean isPremium() {
            return preco >= 4000;
        }
    }

