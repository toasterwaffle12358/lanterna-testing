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
    //starting terminal and screen layers
    val terminal: Terminal = DefaultTerminalFactory().createTerminal()
    val screen: Screen = TerminalScreen(terminal)
    screen.startScreen()
    val textGUI: WindowBasedTextGUI = MultiWindowTextGUI(screen)

    //creating panel
    val panel: Panel = Panel().setLayoutManager(BorderLayout())

    //creating and adding label to panel
    panel.addComponent(Label("label text goes here"))

    //creating window
    val window = BasicWindow()
    window.title = "Hello World"
    window.component = panel


    //creating gui
    val gui = MultiWindowTextGUI(screen, DefaultWindowManager(), EmptySpace(TextColor.RGB(16, 22, 24)))
    //adding window to gui
    gui.addWindowAndWait(window)
}