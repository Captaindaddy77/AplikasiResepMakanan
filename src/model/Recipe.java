/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Muhammad Nabil Zaky - 2310010511
 * Class Recipe
 * Menyimpan data resep makanan
 */
public class Recipe {
        // Nama resep
    private String name;

    // Bahan-bahan resep
    private String ingredients;

    // Instruksi memasak
    private String instructions;

    // Kategori resep (misal: Makanan, Minuman, Camilan)
    private String category;
    
    // Konstruktor
    public Recipe(String name, String ingredients, String instructions, String category) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.category = category;
}
        // Getter & Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getIngredients() { return ingredients; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }

    public String getInstructions() { return instructions; }
    public void setInstructions(String instructions) { this.instructions = instructions; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}
