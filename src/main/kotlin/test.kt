package org.example

//imports

import com.googlecode.lanterna.TextColor
import com.googlecode.lanterna.graphics.SimpleTheme
import com.googlecode.lanterna.gui2.*
import com.googlecode.lanterna.gui2.dialogs.MessageDialog
import com.googlecode.lanterna.screen.Screen
import com.googlecode.lanterna.screen.TerminalScreen
import com.googlecode.lanterna.terminal.DefaultTerminalFactory
import com.googlecode.lanterna.terminal.Terminal

fun main() {
    println("Hello World!")

    //setting up terminal and screen layers
    val terminal: Terminal = DefaultTerminalFactory().createTerminal()
    val screen: Screen = TerminalScreen(terminal)
    screen.startScreen()
    val textGUI: WindowBasedTextGUI = MultiWindowTextGUI(screen)

    //making panel that holds components
    val panel: Panel = Panel()
    panel.addComponent(Label("omg haiii :3"))

    // Create window to hold the panel
    val window = BasicWindow()
    window.title = "Hello World"
    window.component = panel.withBorder(Borders.doubleLine("Title Test"))

    // Create gui and start gui
    val gui = MultiWindowTextGUI(screen, DefaultWindowManager(), EmptySpace(TextColor.RGB(16, 22, 24)))
    gui.addWindowAndWait(window)

}