package com.example.demo;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		Task1 t1 = new Task1("Recordar POO", false, LocalDate.of(2022, 8, 19));
		Task1 t2 = new Task1("Conocer IntelliJ IDEA", false, LocalDate.of(2022, 8, 20));
		Task1 t3 = new Task1("Conocer Spring Boot", false, LocalDate.of(2022, 8, 22));
		Task1 t4 = new Task1("Finalizando tareas...", false, LocalDate.of(2022, 8, 25));
		Task1 t5 = new Task1("Recuperar finalizando tareas...", false, LocalDate.of(2022, 8, 20));

		/*System.out.println("Descripción de la tarea: " + t1.getDescription());
		System.out.println("Fecha de la tarea: " + t1.getDueDate());
		System.out.println("Estado de la tarea realizada: " + t1.getDone());
		t1.setDescription("Recordando POO");
		System.out.println("Descripción de la tarea: " + t1.getDescription());*/

		TaskList metas = new TaskList("Tareas iniciales");

		metas.addTaskList(t1); //agrega tarea a la lista
		metas.addTaskList(t2);
		metas.addTaskList(t3);
		metas.addTaskList(t4);
		metas.addTaskList(t5);

		System.out.println("Tareas iniciales: ");
		metas.printTasks();

		metas.removeTask("Recordar POO");
		System.out.println("Tareas pendientes: ");
		metas.printTasks();


	}

}
