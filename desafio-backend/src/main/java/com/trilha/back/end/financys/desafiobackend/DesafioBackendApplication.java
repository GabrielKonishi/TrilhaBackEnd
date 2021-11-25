package com.trilha.back.end.financys.desafiobackend;

import com.trilha.back.end.financys.desafiobackend.entity.Category;
import com.trilha.back.end.financys.desafiobackend.entity.Entry;
import com.trilha.back.end.financys.desafiobackend.entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DesafioBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioBackendApplication.class, args);
		Category category = new Category(
				1L,"Salário", "Recebimento do salário"
		);
		Category category1 = new Category();
		category1.setId(2L);
		category1.setName("Salário");
		category1.setDescription("Recebimento do salário");

		System.out.println(category.toString());
		System.out.println(category1.toString());

		LocalDate date = LocalDate.of(2021, 9, 15);
		Entry entry = new Entry(
				1L,
				"Salário na Empresa X",
				"Adiantamento quinzenal",
				"revenue",
				"4405,49",
				date,
				true,
				category);

		Entry entry1 = new Entry();
		entry1.setId(2L);
		entry1.setName("Salário na Empresa X");
		entry1.setDescription("Adiantamento quinzenal");
		entry1.setType("revenue");
		entry1.setAmount("4405,49");
		entry1.setDate(date);
		entry1.setPaid(true);
		entry1.setCategory(category1);

		System.out.println(entry);
		System.out.println(entry1);


		List<Product> produtos = new ArrayList<>();
		Product product = new Product(
			1L, "test", "test", 10.00
		);
		Product product1 = new Product(
				1L, "test", "test", 20.00
		);
		Product product2 = new Product(
				1L, "test", "test", 30.00
		);
		Product product3 = new Product(
				1L, "test", "test", 40.00
		);
		Product product4 = new Product(
				1L, "test", "test", 50.00
		);

		produtos.add(product);
		produtos.add(product1);
		produtos.add(product2);
		produtos.add(product3);
		produtos.add(product4);
		System.out.println(produtos.toString());

		List<Product> produtosMaisCaros = new ArrayList<>();
		produtosMaisCaros.add(product4);
		produtosMaisCaros.add(product3);
		produtosMaisCaros.add(product2);

		System.out.println(produtosMaisCaros.toString());

	}



}
