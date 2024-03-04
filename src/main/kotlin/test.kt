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
    //creating themes
    val exampleTheme = SimpleTheme.makeTheme(false, TextColor.RGB( 235, 232, 200 ), TextColor.RGB(14, 21, 24), TextColor.RGB(14, 21, 24), TextColor.RGB(14, 21, 24), TextColor.RGB( 235, 232, 200 ), TextColor.RGB(14, 21, 24), TextColor.RGB(14, 21, 24))

    //starting terminal and screen layers
    val terminal: Terminal = DefaultTerminalFactory().createTerminal()
    val screen: Screen = TerminalScreen(terminal)
    screen.startScreen()
    val textGUI: WindowBasedTextGUI = MultiWindowTextGUI(screen)

    //creating panel
    val panel = Panel()

    //creating and adding label to panel
    val label1 = Label("label text goes here")
    label1.withBorder(Borders.doubleLine())
    panel.addComponent(label1)

    //creating button
    val button1: Button = Button("test button 1", Runnable {})
    val button2: Button = Button("test button 2", Runnable {})
    panel.addComponent(button1)
    panel.addComponent(button2)

    //creating window
    val window = BasicWindow()
    window.title = "Hello World"
    window.component = panel.withBorder(Borders.singleLineBevel())


    //creating gui
    val gui = MultiWindowTextGUI(screen, DefaultWindowManager(), EmptySpace(TextColor.RGB(16, 22, 24)))
    //adding window to gui
    gui.addWindowAndWait(window)
}