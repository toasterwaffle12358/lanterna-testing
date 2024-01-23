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
    terminal.terminalSize.rows

    //making panel that holds components
    val panel: Panel = Panel().setLayoutManager(BorderLayout())
    //panel.setPreferredSize(terminal.terminalSize.withRows(5))
    panel.addComponent(Label("omg haiii :3").setBackgroundColor(TextColor.RGB(173, 216, 230)))
    panel.fillColorOverride = TextColor.RGB(173, 216, 230)
    panel.setLayoutData(BorderLayout.Location.BOTTOM);



    // Create window to hold the panel
    val window = BasicWindow()
    window.component = panel
    window.title = "no freaking way this is so crazy"
    window.setHints(listOf(Window.Hint.CENTERED, Window.Hint.EXPANDED));
    val window2 = BasicWindow()
    window2.component = panel
    window2.title = "hehe :3"
    window2.setHints(listOf(Window.Hint.CENTERED, Window.Hint.EXPANDED));




    // Create gui and start gui
    val gui = MultiWindowTextGUI(screen, DefaultWindowManager(), EmptySpace(TextColor.RGB(248, 200, 220)))
    gui.addWindowAndWait(window)
    gui.addWindowAndWait(window2)

}