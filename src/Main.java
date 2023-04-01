import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java....");
        curso1.setCargaHoraria(8);



        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição do curso js....");
        curso2.setCargaHoraria(4);

        //conceito polimorfismo: Tudo que eu tenho em Conteudo eu tenho em Curso mas
        //nem tudo que eu tenho em Curso eu tenho dentro de Conteudo.
        // Conteudo conteudo = new Curso();
        //Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());



      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        //criando bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        //criando devs
        Dev devPablo = new Dev();
        devPablo.setNome("Pablo");
        System.out.println("Conteudos Inscritos"+ devPablo.getConteudosInscritos());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
        //a saida de ambos foi vazia pos nenhum deles se matriculou em nenhum bootcamp

        //adicionando os devs no bootcamp, agora a saida funcionou corretamente
        devPablo.inscreverBootcamp(bootcamp);
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos"+ devPablo.getConteudosInscritos());
        System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());


        System.out.println("Conteudos Concluidos"+ devPablo.getConteudosConcluidos());
        System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluidos());
        //a saida de ambos foi vazia pois nenhum deles terminou nenhum curso do bootcamp


        System.out.println("\n---PABLO---");
        devPablo.progredir();
        devPablo.progredir();
        System.out.println("Conteudos Inscritos"+ devPablo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos"+ devPablo.getConteudosConcluidos());
        System.out.println("XP:"+ devPablo.calcularTotalXp());


        System.out.println("\n---JOAO---");
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("XP:"+devJoao.calcularTotalXp());
    }
}