package com.sksamuel.scrimage.filter

import java.awt.{Color, Graphics2D}

import com.sksamuel.scrimage.{Filter, Image}
import thirdparty.romainguy.BlendComposite._
import thirdparty.romainguy.BlendingMode

object BackgroundBlendFilter extends Filter {
  def apply(image: Image) {

    val background = image.fill(new Color(51, 0, 0))
    val g = image.awt.getGraphics.asInstanceOf[Graphics2D]
    g.setComposite(getInstance(BlendingMode.ADD, 1f))
    g.drawImage(background.awt, 0, 0, null)
    g.dispose()
  }
}
