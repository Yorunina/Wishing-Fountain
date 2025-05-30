# Wishing Fountain Mod

This mod adds a multiblock structure and two key items (Buddelschiff) that allow players to obtain location maps (for biomes or structures), directly acquire specific items, or change weather conditions through wishing.

Wishing requires specific material combinations. A wish will only succeed if there's a corresponding recipe for the target. The mod includes default recipes for vanilla biomes and structures. Modpack authors need to create recipes for modded targets.

## How to Build

**Step-by-Step Construction**

**Step 1** ![1_step](https://cdn.modrinth.com/data/mp9ceiLG/images/b9c99c654881ab1684a92c7eb52517924cf1c6af.png)

**Step 2** ![2_step](https://cdn.modrinth.com/data/mp9ceiLG/images/d0d41c3db22d729c79f5a933becba6ee5468dd55.png)

**Step 3** ![3_step](https://cdn.modrinth.com/data/mp9ceiLG/images/5aa1adffca9e1933ab2f8e7b4b4244bed18d914c.png)

**Step 4** Pour a bucket of water on the top then throw a Heart of the Sea into the pool (trigger item can be modified via config)  
![4_step](https://cdn.modrinth.com/data/mp9ceiLG/images/b273fb62f80f39212ea589ca92f4bc6dcdd15b0f.png)

**Complete!** ![accomplish](https://cdn.modrinth.com/data/mp9ceiLG/images/54bafa860e9dad842c86f7e9a21a88a1ef0867d0.png)

### Construction Materials

|Layer|Material|Quantity|
|---|---|---|
|**Layer 1**|Smooth Quartz Block|16|
||Waterlogged Smooth Quartz Slab|8|
||Quartz Pillar|1|
|**Layer 2**|Quartz Pillar|1|
|**Layer 3**|Quartz Pillar|1|
|**Layer 4**|Quartz Pillar|1|
|**Layer 5**|Water|1|

---

## How to Make a Wish

Throw matching items into the pool (shapeless). Upon success, you'll receive a Buddelschiff (for locations) or **directly obtain items** (view recipes via JEI if installed).  
![make_a_wish](https://cdn.modrinth.com/data/mp9ceiLG/images/9f36539a0a64bda8a1d4cdf209f3cbf067e28b6a.png)

---

## How to Write a Recipe

Wishing Fountain recipes support up to 8 input items and output:

- Location-targeted Buddelschiff

- Weather changes

- Direct items


### Structure Example

```json
{  
  "type": "wishing_fountain:wishing_fountain_recipe",  
  "wish_type": "structure",  
  "target": "minecraft:desert_pyramid",  
  "ingredients": [  
    { "item": "minecraft:sandstone" },  
    { "item": "minecraft:gold_ingot" },  
    { "item": "minecraft:emerald" }  
  ]  
}
```

### Item Example

```json
{  
  "type": "wishing_fountain:wishing_fountain_recipe",  
  "wish_type": "item",  
  "target": "minecraft:coal",  
  "ingredients": [  
    { "item": "minecraft:diamond" },  
    { "item": "minecraft:gold_ingot" },  
    { "item": "minecraft:emerald" }  
  ]  
}
```

### Key Parameters:

|Parameter|Description|
|---|---|
|`wish_type`|`structure`/`biome`/`weather`/`item`|
|`target`|• Weather: `clear`/`rain`/`thunder` (only one active weather recipe allowed)  <br>• Items: **Item registry name** (e.g., `"minecraft:emerald"`)|
|`ingredients`|Shapeless recipe, supports up to 8 items|

#### Recipe Notes

- **Recipes will be invalid if duplicate items appear in the input ingredients.**

- **Wishes can still succeed even if extra items beyond the recipe requirements are thrown into the pool.**


---

## Important Notes

- ⚖️ The Bottle Ship's search speed is moderate but optimized to prevent server lag.

- 🔥 **Nether biomes/structures cannot be located** – vanilla maps do not support the Nether dimension.

- 📍 Default max search radius: 10,000 blocks (configurable).
