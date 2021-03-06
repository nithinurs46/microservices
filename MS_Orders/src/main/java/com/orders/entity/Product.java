package com.orders.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

	private Long id;
	private String name;
	private String description;
	private Double price;
	private String category;

}
