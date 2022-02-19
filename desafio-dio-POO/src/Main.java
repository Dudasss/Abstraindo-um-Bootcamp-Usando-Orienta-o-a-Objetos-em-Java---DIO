import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        //Instanciando dois cursos e uma mentoria
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria1 = new Mentoria();

        //Adding infos ao curso1
        curso1.setTitulo("Lógica de Programação Essencial");
        curso1.setDescriçao("Descrição: Lógica de programação é a forma como o desenvolvedor " +
                "entende a comunicação a fim de programar uma função de um programa.");
        curso1.setCargaHoraria(4);

        //Adding infos ao curso2
        curso2.setTitulo("Estrutura de dados em Java");
        curso2.setDescriçao("Descrição: Aprenda o que são estruturas de dados em um sistema e qual a " +
                "importância dela, como trabalhar com o armazenamento das informações de forma " +
                "ágil e otimizada.");
        curso2.setCargaHoraria(8);

        //Adding infos a mentoria
        mentoria1.setData(LocalDate.now());
        mentoria1.setTitulo("Como resolver desafios de código.");
        mentoria1.setDescriçao("Descrição: Esclarecer dúvidas sobre como resolver desafios de código.");

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        //Instanciando e Adding infos ao bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT Start #4 Java");
        bootcamp.setDescriçao("Descrição: Bootcamp Java");
        //Adding conteudos ao bootcamp
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        //Instanciando e Adding infos a Dev
        Dev devDuda = new Dev();
        devDuda.setNome("Duda");
        //inscrevendo a Dev no bootcamp
        devDuda.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devDuda.getConteudosInscritos());
        //fazendo com que a Dev avance um curso no bootcamp
        devDuda.progredir();
        System.out.println("Conteudos Concluidos: " + devDuda.getConteudosConcluidos());
        System.out.println("Total XP: " + devDuda.calcularTotalXp());


        Dev devTina = new Dev();
        devTina.setNome("Tina");
        devTina.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devTina.getConteudosInscritos());
        devTina.progredir();
        devTina.progredir();
        devTina.progredir();
        System.out.println("Conteudos Concluidos: " + devTina.getConteudosConcluidos());
        System.out.println("Total XP: " + devTina.calcularTotalXp());



    }
}
