package org.example

//imports
import com.googlecode.lanterna.TextColor
import com.googlecode.lanterna.gui2.*
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

    //making panel that holds components
    val panel: Panel = Panel()
    panel.setLayoutManager(GridLayout(2))

    // Create window to hold the panel
    val window = BasicWindow()
    window.component = panel


    // Create gui and start gui
    val gui = MultiWindowTextGUI(screen, DefaultWindowManager(), EmptySpace(TextColor.ANSI.BLUE))
    gui.addWindowAndWait(window)
}