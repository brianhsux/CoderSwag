package com.example.brianhsu.coderswag.Services

import com.example.brianhsu.coderswag.Model.Category
import com.example.brianhsu.coderswag.Model.Product

/**
 * Created by brianhsu on 8/21/17.
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat1", "This is the best one you've seen."),
            Product("Devslopes Hat Black", "$20", "hat2", "I promise this will be very nice."),
            Product("Devslopes Hat White", "$18", "hat3", "Originally an undergarment worn exclusively by men, it has become, in American English, a catch-all term for a broad variety of upper-body garments and undergarments. In British English, a shirt is more specifically a garment with a collar, sleeves with cuffs, and a full vertical opening with buttons or snaps (North Americans would call that a \"dress shirt\", a specific type of \"collared shirt\")"),
            Product("Devslopes Hat Snapback", "$22", "hat4", "The shirt sometimes had frills at the neck or cuffs. In the sixteenth century, men's shirts often had embroidery, and sometimes frills or lace at the neck and cuffs and through the eighteenth century long neck frills, or jabots, were fashionable.[8][9] Coloured shirts began to appear in the early nineteenth century, as can be seen in the paintings of George Caleb Bingham. They were considered casual wear, for lower-class workers only, until the twentieth century. For a gentleman, \"to wear a sky-blue shirt was unthinkable in 1860 but had become standard by 1920 and, in 1980, constituted the most commonplace event.\"[10]"),
            Product("Devslopes Graphic Beanie", "$18", "hat1", "This is the best one you've seen."),
            Product("Devslopes Hat Black", "$20", "hat2", "I promise this will be very nice."),
            Product("Devslopes Hat White", "$18", "hat3", "Originally an undergarment worn exclusively by men, it has become, in American English, a catch-all term for a broad variety of upper-body garments and undergarments. In British English, a shirt is more specifically a garment with a collar, sleeves with cuffs, and a full vertical opening with buttons or snaps (North Americans would call that a \"dress shirt\", a specific type of \"collared shirt\")"),
            Product("Devslopes Hat Snapback", "$22", "hat4", "The shirt sometimes had frills at the neck or cuffs. In the sixteenth century, men's shirts often had embroidery, and sometimes frills or lace at the neck and cuffs and through the eighteenth century long neck frills, or jabots, were fashionable.[8][9] Coloured shirts began to appear in the early nineteenth century, as can be seen in the paintings of George Caleb Bingham. They were considered casual wear, for lower-class workers only, until the twentieth century. For a gentleman, \"to wear a sky-blue shirt was unthinkable in 1860 but had become standard by 1920 and, in 1980, constituted the most commonplace event.\"[10]")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie1", "A hoodie (also called a hooded sweatshirt, hooded jumper or hoody) is a sweatshirt with a hood. Hoodies often include a muff sewn onto the lower front, and (usually) a drawstring to adjust the hood opening."),
            Product("Devslopes Hoodie Red", "$32", "hoodie2", "Hooded garments have been a documented part of men's and women's wear for centuries. The word hood derives from the Anglo-Saxon word hōd,[1] ultimately of the same root as English hat."),
            Product("Devslopes Gray Hoodie", "$28", "hoodie3", "By the 1990s, the hoodie had evolved into a symbol of isolation,[citation needed] a statement of academic spirit,[citation needed] and several fashion collections.[7] The association with chavs or neds in the UK developed around this time, as their popularity rose with that specific demographic."),
            Product("Devslopes Black Hoodie", "$32", "hoodie4", "In June 2011, police in Wynnum, Brisbane, launched a \"Hoodie Free Zone\" initiative, with shopkeepers encouraged to ask hoodie-wearers to leave. The zone is part of an initiative to educate businesses on how they can avoid armed robberies, in which the hoodie type of clothing is often worn."),
            Product("Devslopes Hoodie Gray", "$28", "hoodie1", "A hoodie (also called a hooded sweatshirt, hooded jumper or hoody) is a sweatshirt with a hood. Hoodies often include a muff sewn onto the lower front, and (usually) a drawstring to adjust the hood opening."),
            Product("Devslopes Hoodie Red", "$32", "hoodie2", "Hooded garments have been a documented part of men's and women's wear for centuries. The word hood derives from the Anglo-Saxon word hōd,[1] ultimately of the same root as English hat."),
            Product("Devslopes Gray Hoodie", "$28", "hoodie3", "By the 1990s, the hoodie had evolved into a symbol of isolation,[citation needed] a statement of academic spirit,[citation needed] and several fashion collections.[7] The association with chavs or neds in the UK developed around this time, as their popularity rose with that specific demographic."),
            Product("Devslopes Black Hoodie", "$32", "hoodie4", "In June 2011, police in Wynnum, Brisbane, launched a \"Hoodie Free Zone\" initiative, with shopkeepers encouraged to ask hoodie-wearers to leave. The zone is part of an initiative to educate businesses on how they can avoid armed robberies, in which the hoodie type of clothing is often worn.")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18", "shirt1", ""),
            Product("Devslopes Badge Light Gray", "$20", "shirt2", ""),
            Product("Devslopes Logo Shirt Red", "$22", "shirt3", ""),
            Product("Devslopes Hustle", "$22", "shirt4", ""),
            Product("Kickflip Studios", "18", "shirt5", "")

    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product> {

        return when(category) {
            "HATS" -> hats
            "SHIRTS" -> shirts
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }

}