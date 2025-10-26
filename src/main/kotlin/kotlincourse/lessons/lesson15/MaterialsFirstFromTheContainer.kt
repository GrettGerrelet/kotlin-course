package org.example.kotlincourse.lessons.lesson15

class MaterialsFirstFromTheContainer: Materials() {
    fun extractFirst(): String {
        val materials = extractMaterials()
        materials.dropLast(1)
                    .forEach { addMaterial(it) }
        return materials.first()
    }
}