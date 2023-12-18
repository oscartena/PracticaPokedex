package com.example.practica12_pokedex.main.items.models;

import com.example.practica12_pokedex.main.items.CustomDeserializer.CategoryDeserializer;
import com.example.practica12_pokedex.main.items.CustomDeserializer.EfectosDeserializer;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;


public class Item {
    private String name;
    @SerializedName("category")
    @JsonAdapter(CategoryDeserializer.class)
    private String category;
    private String cost;
    @SerializedName("effect_entries")
    @JsonAdapter(EfectosDeserializer.class)
    private String effect;

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getCost() {
        return cost;
    }

    public String getEffect() {
        return effect;
    }

    public String getUrl() {
        String index = this.name;
        return String.format("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/items/%s.png", index);
    }
}
