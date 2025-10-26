package org.example.kotlincourse.lessons.lesson15

class MaterialsFromMiddle: Materials() {
    fun extractMiddle(): String {
        val materials = extractMaterials()
        val index = materials.size / 2
        for (i in materials.indices) {
            if (i == index) continue
            addMaterial(materials[i])
        }
        return materials[index]
    }
}