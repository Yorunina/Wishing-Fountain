# Wishing Fountain Mod

This mod adds a multiblock structure and two key items (Bottle Ship) that allow players to obtain location maps (for biomes or structures) through wishing, as well as change weather conditions.

Wishing requires specific material combinations. A wish will only succeed if there's a corresponding recipe for the target. The mod includes default recipes for vanilla biomes and structures. Modpack authors need to create recipes for modded targets.

## How to Build
**Step-by-Step Construction**

**Step 1**  
![1_step](https://cdn.modrinth.com/data/mp9ceiLG/images/b9c99c654881ab1684a92c7eb52517924cf1c6af.png)

**Step 2**  
![2_step](https://cdn.modrinth.com/data/mp9ceiLG/images/d0d41c3db22d729c79f5a933becba6ee5468dd55.png)

**Step 3**  
![3_step](https://cdn.modrinth.com/data/mp9ceiLG/images/5aa1adffca9e1933ab2f8e7b4b4244bed18d914c.png)

**Step 4**  
Throw a Heart of the Sea into the pool (trigger item can be modified via config)  
![4_step](https://cdn.modrinth.com/data/mp9ceiLG/images/b273fb62f80f39212ea589ca92f4bc6dcdd15b0f.png)

**Complete!**  
![accomplish](https://cdn.modrinth.com/data/mp9ceiLG/images/54bafa860e9dad842c86f7e9a21a88a1ef0867d0.png)

### Construction Materials

| Layer       | Material                       | Quantity |
| ----------- | ------------------------------ | -------- |
| **Layer 1** | Smooth Quartz Block            | 16       |
|             | Waterlogged Smooth Quartz Slab | 8        |
|             | Quartz Pillar                  | 1        |
| **Layer 2** | Quartz Pillar                  | 1        |
| **Layer 3** | Quartz Pillar                  | 1        |
| **Layer 4** | Quartz Pillar                  | 1        |

---

## How to Make a Wish
Throw matching items into the pool (shapeless). Upon success, you'll receive a Buddelschiff (view recipes via JEI if installed).  
![make_a_wish](https://cdn.modrinth.com/data/mp9ceiLG/images/9f36539a0a64bda8a1d4cdf209f3cbf067e28b6a.png)

---

## How to Write a Recipe
Wishing Fountain recipes support up to 8 input items and output a location-targeted Bottle Ship or weather change. Example recipe:

```json
{
  "type": "wishing_fountain:wishing_fountain_recipe",
  "wish_type": "structure",
  "target": "minecraft:desert_pyramid",
  "ingredients": [
    {"item": "minecraft:sandstone"},
    {"item": "minecraft:gold_ingot"},
    {"item": "minecraft:emerald"}
  ]
}
```

* **Key Parameters:**

- `wish_type`: Supports `structure`, `biome`, or `weather`

- `target`: For weather, use `clear`, `rain`, or `thunder` (only one active weather recipe allowed)


---

## Important Notes

- 📍 The Bottle Ship's search speed is moderate, but optimized to prevent server lag

- 🔥 Nether biomes/structures cannot be located - uses vanilla maps which don't support Nether
    