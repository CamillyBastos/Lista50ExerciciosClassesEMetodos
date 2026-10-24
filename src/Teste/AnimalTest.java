package Teste;
import Dominio.Animal;

public class AnimalTest {
    public static void main(String[] args) {

            Animal animal1 = new Animal();
            animal1.nome = "Rex";
            animal1.especie = "Cachorro";
            animal1.idade = 5;

            Animal animal2 = new Animal();
            animal2.nome = "Mimi";
            animal2.especie = "Gato";
            animal2.idade = 2;

            System.out.println("=== Animal 1 ===");
            System.out.println(animal1.nome);
            System.out.println(animal1.especie);
            System.out.println(animal1.idade);

            System.out.println("\n=== Animal 2 ===");
            System.out.println(animal2.nome);
            System.out.println(animal2.especie);
            System.out.println(animal2.idade);
        }
    }

