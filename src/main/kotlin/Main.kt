package org.example

//imports
import com.googlecode.lanterna.TextColor
import com.googlecode.lanterna.graphics.SimpleTheme
import com.googlecode.lanterna.gui2.*
import com.googlecode.lanterna.screen.Screen
import com.googlecode.lanterna.screen.TerminalScreen
import com.googlecode.lanterna.terminal.DefaultTerminalFactory
import com.googlecode.lanterna.terminal.Terminal


fun main() {
    println("Hello World!")

    val basicTheme = SimpleTheme.makeTheme(false, TextColor.RGB( 235, 232, 200 ), TextColor.RGB(14, 21, 24), TextColor.RGB(14, 21, 24), TextColor.RGB(14, 21, 24), TextColor.RGB(14, 21, 24), TextColor.RGB(14, 21, 24), TextColor.RGB(14, 21, 24))

    //setting up terminal and screen layers
    val terminal: Terminal = DefaultTerminalFactory().createTerminal()
    val screen: Screen = TerminalScreen(terminal)
    screen.startScreen()
    terminal.terminalSize.rows

    //making panel that holds components
    val panel: Panel = Panel().setLayoutManager(BorderLayout())
    panel.addComponent(Label("omg haiii :3").setBackgroundColor(TextColor.RGB(22, 38, 46)).withBorder(Borders.doubleLine()).setLayoutData(BorderLayout.Location.LEFT))
    panel.addComponent(Label("test test test").setBackgroundColor(TextColor.RGB(22, 38, 46)).withBorder(Borders.doubleLine()).setLayoutData(BorderLayout.Location.CENTER))
    panel.addComponent(Label("dfsgkljdlfkgdslkfjlkdjsf").setBackgroundColor(TextColor.RGB(22, 38, 46)).withBorder(Borders.doubleLine()).setLayoutData(BorderLayout.Location.RIGHT))
    panel.fillColorOverride = TextColor.RGB(22, 38, 46)



    // Create window to hold the panel
    val window = BasicWindow()
    window.component = panel
    window.title = "no freaking way this is so crazy"
    window.setHints(listOf(Window.Hint.CENTERED, Window.Hint.FULL_SCREEN, Window.Hint.NO_POST_RENDERING));
    window.theme = basicTheme





    // Create gui and start gui
    val gui = MultiWindowTextGUI(screen, DefaultWindowManager(), EmptySpace(TextColor.RGB(16, 22, 24)))
    gui.addWindowAndWait(window)

}