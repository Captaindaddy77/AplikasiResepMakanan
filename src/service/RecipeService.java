/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import model.Recipe;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Muhammad Nabil Zaky - 2310010511
 * Class RecipeService
 * Menangani data dan logika bisnis resep
 */
public class RecipeService {
        // List untuk menyimpan semua resep
    private List<Recipe> recipeList = new ArrayList<>();

    // Menambahkan resep baru
    public void addRecipe(Recipe recipe) {
        recipeList.add(recipe);
    }

    // Mengubah resep berdasarkan index
    public void updateRecipe(int index, Recipe recipe) {
        if (index >= 0 && index < recipeList.size()) {
            recipeList.set(index, recipe);
        }
    }

    // Menghapus resep berdasarkan index
    public void deleteRecipe(int index) {
        if (index >= 0 && index < recipeList.size()) {
            recipeList.remove(index);
        }
    }

    // Mengembalikan semua resep
    public List<Recipe> getAllRecipes() {
        return recipeList;
    }
}
