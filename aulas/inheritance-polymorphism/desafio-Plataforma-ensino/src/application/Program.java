package application;

import entities.Lesson;
import entities.Task;
import entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Lesson> lessonList = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            System.out.println("Dados da" + i + "a aula: ");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char option = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Tullio: ");
            String title = sc.nextLine();

            if (option == 'c'){

                System.out.print("URL do vídeo: ");
                String url = sc.nextLine();
                System.out.print("Duração em segundos: ");
                int seconds = sc.nextInt();

                lessonList.add(new Video(title, url, seconds));
            } else {
                System.out.print("Descrição: ");
                String description = sc.nextLine();
                System.out.print("Quantidade de questões: ");
                int questionCount = sc.nextInt();

                lessonList.add(new Task(title, description, questionCount));
            }


        }


        int duration = 0;
        System.out.println();
        for (Lesson lesson : lessonList){
            duration += lesson.duration();
        }
        System.out.println("DURAÇÃO TOTAL DO CURSO = " + duration);
        sc.close();
    }
}
