package org.example

//imports
import com.googlecode.lanterna.TextColor
import com.googlecode.lanterna.graphics.TextGraphics
import com.googlecode.lanterna.graphics.Theme
import com.googlecode.lanterna.graphics.ThemeStyle
import com.googlecode.lanterna.gui2.*
import com.googlecode.lanterna.screen.Screen
import com.googlecode.lanterna.screen.TerminalScreen
import com.googlecode.lanterna.terminal.DefaultTerminalFactory
import com.googlecode.lanterna.terminal.Terminal
import java.awt.Frame


fun main() {
    println("Hello World!")

    //setting up terminal and screen layers
    val terminal: Terminal = DefaultTerminalFactory().createTerminal()
    val screen: Screen = TerminalScreen(terminal)
    screen.startScreen()
    terminal.terminalSize.rows

    //making panel that holds components
    val panel: Panel = Panel()
    panel.setPreferredSize(terminal.terminalSize.withRows(5))
    panel.addComponent(Label("omg haiii :3"))/*.withBorder(Borders.doubleLineBevel("omgggggggg no wayyy ")))*/
    panel.fillColorOverride = TextColor.RGB(173, 216, 230)



    // Create window to hold the panel
    val window = BasicWindow()
    window.component = panel




    // Create gui and start gui
    val gui = MultiWindowTextGUI(screen, DefaultWindowManager(), EmptySpace(TextColor.RGB(248, 200, 220)))
    gui.addWindowAndWait(window)

}