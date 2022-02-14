package com.techreturners.exercise003

class Exercise003 {

  private var flavours = Array("Pistachio",
    "Raspberry Ripple",
    "Vanilla",
    "Mint Chocolate Chip",
    "Chocolate",
    "Mango Sorbet"
  )

  def getIceCreamCode(iceCreamFlavour: String): Int = {
    //throw new UnsupportedOperationException("You can delete this line and add your code here.")
    flavours.indexOf(iceCreamFlavour)
  }

  def iceCreamFlavours: Array[String] = {
    //throw new UnsupportedOperationException("You can delete this line and add your code here.")
    flavours
  }

}
