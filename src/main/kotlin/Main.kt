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
import java.util.concurrent.atomic.AtomicBoolean
import javax.swing.KeyStroke


fun main() {
    println("Hello World!")

    var labelText: String = "no way, kotlin text ui!"
    var grid1LabelText: String = "[___]"
    var grid2LabelText: String = "[___]"
    var grid3LabelText: String = "[___]"
    var grid4LabelText: String = "[___]"
    var grid5LabelText: String = "[___]"
    var grid6LabelText: String = "[___]"
    var grid7LabelText: String = "[___]"
    var grid8LabelText: String = "[___]"

    val basicTheme = SimpleTheme.makeTheme(false, TextColor.RGB( 235, 232, 200 ), TextColor.RGB(14, 21, 24), TextColor.RGB(14, 21, 24), TextColor.RGB(14, 21, 24), TextColor.RGB( 235, 232, 200 ), TextColor.RGB(14, 21, 24), TextColor.RGB(14, 21, 24))
    val buttonTheme = SimpleTheme.makeTheme(true, TextColor.RGB( 235, 232, 200 ), TextColor.RGB(14, 21, 24), TextColor.RGB( 235, 232, 200 ), TextColor.RGB( 235, 232, 200 ), TextColor.RGB( 235, 232, 200 ), TextColor.RGB(32, 95, 122), TextColor.RGB(14, 21, 24))

    //setting up terminal and screen layers
    val terminal: Terminal = DefaultTerminalFactory().createTerminal()
    val screen: Screen = TerminalScreen(terminal)
    screen.startScreen()

    val textGUI: WindowBasedTextGUI = MultiWindowTextGUI(screen)

    //making panel that holds components
    val panel: Panel = Panel().setLayoutManager(BorderLayout())
    panel.addComponent(Label("omg haiii :3").setBackgroundColor(TextColor.RGB(22, 38, 46)).withBorder(Borders.doubleLine()).setLayoutData(BorderLayout.Location.LEFT))
    panel.addComponent(Label("kitty display system: \n" +
            "    /\\_/\\           ___ \n" +
            "   = o_o =_______    \\ \\ \n" +
            "    __^      __(  \\.__) ) \n" +
            "(@)<_____>__(_____)____/ \n" +
            "OMGGGG KITTYYYYY HAIIIIIIII!!!!! \n" +
            "    /\\_/\\           ___ \n" +
            "   = o_o =_______    \\ \\ \n" +
            "    __^      __(  \\.__) ) \n" +
            "(@)<_____>__(_____)____/ \n" +
            "OMGGGG KITTYYYYY HAIIIIIIII!!!!! \n" +
            "    /\\_/\\           ___ \n" +
            "   = o_o =_______    \\ \\ \n" +
            "    __^      __(  \\.__) ) \n" +
            "(@)<_____>__(_____)____/ \n" +
            "OMGGGG KITTYYYYY HAIIIIIIII!!!!! \n" +
            "    /\\_/\\           ___ \n" +
            "   = o_o =_______    \\ \\ \n" +
            "    __^      __(  \\.__) ) \n" +
            "(@)<_____>__(_____)____/ \n" +
            "OMGGGG KITTYYYYY HAIIIIIIII!!!!! \n" +
            "    /\\_/\\           ___ \n" +
            "   = o_o =_______    \\ \\ \n" +
            "    __^      __(  \\.__) ) \n" +
            "(@)<_____>__(_____)____/ \n" +
            "OMGGGG KITTYYYYY HAIIIIIIII!!!!! \n" +
            "    /\\_/\\           ___ \n" +
            "   = o_o =_______    \\ \\ \n" +
            "    __^      __(  \\.__) ) \n" +
            "(@)<_____>__(_____)____/ \n" +
            "OMGGGG KITTYYYYY HAIIIIIIII!!!!!"
    ).setBackgroundColor(TextColor.RGB(22, 38, 46)).withBorder(Borders.doubleLine()).setLayoutData(BorderLayout.Location.CENTER))
    var changingLabel = Label(labelText).setBackgroundColor(TextColor.RGB(22, 38, 46)).withBorder(Borders.doubleLine()).setLayoutData(BorderLayout.Location.RIGHT)
    panel.addComponent(changingLabel)
    panel.fillColorOverride = TextColor.RGB(22, 38, 46)

    //making second panel that has flag
    val bottomPanel: Panel = Panel().setLayoutManager(LinearLayout(Direction.VERTICAL))
    //making sub-panels that will hold flag colors
    val subBottomPanel: Panel = Panel().setLayoutManager(BorderLayout())
    subBottomPanel.fillColorOverride = TextColor.RGB( 174, 214, 241 )
    subBottomPanel.addComponent(Label("").setBackgroundColor(TextColor.RGB( 174, 214, 241 )))
    //bottomPanel.addComponent(subBottomPanel.setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Fill)))
    val subBottomPanel2: Panel = Panel().setLayoutManager(BorderLayout())
    subBottomPanel2.fillColorOverride = TextColor.RGB( 255, 210, 253 )
    subBottomPanel2.addComponent(Label("").setBackgroundColor(TextColor.RGB( 255, 210, 253 )))
    //bottomPanel.addComponent(subBottomPanel2.setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Fill)))
    val subBottomPanel3: Panel = Panel().setLayoutManager(BorderLayout())
    subBottomPanel3.fillColorOverride = TextColor.RGB( 249, 249, 249 )
    subBottomPanel3.addComponent(Label("").setBackgroundColor(TextColor.RGB( 249, 249, 249 )))
    //bottomPanel.addComponent(subBottomPanel3.setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Fill)))
    val subBottomPanel4: Panel = Panel().setLayoutManager(BorderLayout())
    subBottomPanel4.fillColorOverride = TextColor.RGB( 255, 210, 253 )
    subBottomPanel4.addComponent(Label("").setBackgroundColor(TextColor.RGB( 255, 210, 253 )))
    //bottomPanel.addComponent(subBottomPanel4.setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Fill)))
    val subBottomPanel5: Panel = Panel().setLayoutManager(BorderLayout())
    subBottomPanel5.fillColorOverride = TextColor.RGB( 174, 214, 241 )
    subBottomPanel5.addComponent(Label("").setBackgroundColor(TextColor.RGB( 174, 214, 241 )))
    //bottomPanel.addComponent(subBottomPanel5.setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Fill)))

    //making grid
    //making grid container
    val gridPanel: Panel = Panel().setLayoutManager(GridLayout(4))
    //creating labels for grid
    var gridLabel1 = Label(grid1LabelText)
    var gridLabel2 = Label(grid2LabelText)
    var gridLabel3 = Label(grid3LabelText)
    var gridLabel4 = Label(grid4LabelText)
    var gridLabel5 = Label(grid5LabelText)
    var gridLabel6 = Label(grid6LabelText)
    var gridLabel7 = Label(grid7LabelText)
    var gridLabel8 = Label(grid8LabelText)

    gridPanel.addComponent(gridLabel1)
    gridPanel.addComponent(gridLabel2)
    gridPanel.addComponent(gridLabel3)
    gridPanel.addComponent(gridLabel4)
    gridPanel.addComponent(gridLabel5)
    gridPanel.addComponent(gridLabel6)
    gridPanel.addComponent(gridLabel7)
    gridPanel.addComponent(gridLabel8)
    bottomPanel.addComponent(gridPanel)

    fun RefreshGrid() {
        gridPanel.removeAllComponents()

        gridLabel1 = Label(grid1LabelText)
        gridLabel2 = Label(grid2LabelText)
        gridLabel3 = Label(grid3LabelText)
        gridLabel4 = Label(grid4LabelText)
        gridLabel5 = Label(grid5LabelText)
        gridLabel6 = Label(grid6LabelText)
        gridLabel7 = Label(grid7LabelText)
        gridLabel8 = Label(grid8LabelText)

        gridPanel.addComponent(gridLabel1)
        gridPanel.addComponent(gridLabel2)
        gridPanel.addComponent(gridLabel3)
        gridPanel.addComponent(gridLabel4)
        gridPanel.addComponent(gridLabel5)
        gridPanel.addComponent(gridLabel6)
        gridPanel.addComponent(gridLabel7)
        gridPanel.addComponent(gridLabel8)
        bottomPanel.addComponent(gridPanel)
    }


    //making panel that holds buttons
    val subBottomPanel6: Panel = Panel().setLayoutManager(LinearLayout(Direction.HORIZONTAL)).setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Fill))
    //making buttons
    val button1 = Button("test button 1", Runnable {
        //MessageDialog.showMessageDialog(textGUI, "Message", "holy moly guacamole 1");
        labelText = "button 1 has been pressed"
        grid1LabelText = if (grid1LabelText == "[___]") {
            "[_x_]"
        } else {
            "[___]"
        }
        panel.removeComponent(changingLabel)
        changingLabel = Label(labelText).setBackgroundColor(TextColor.RGB(22, 38, 46)).withBorder(Borders.doubleLine()).setLayoutData(BorderLayout.Location.RIGHT)
        panel.addComponent(changingLabel)
        RefreshGrid()
    }).setRenderer(Button.FlatButtonRenderer()).withBorder(Borders.doubleLine("button title")).setVisible(true).setTheme(buttonTheme).setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Fill))
    val button2 = Button("test button 2", Runnable {
        //MessageDialog.showMessageDialog(textGUI, "Message", "holy moly guacamole 2");
        labelText = "button 2 has been pressed"
        grid2LabelText = if (grid2LabelText == "[___]") {
            "[_x_]"
        } else {
            "[___]"
        }
        panel.removeComponent(changingLabel)
        changingLabel = Label(labelText).setBackgroundColor(TextColor.RGB(22, 38, 46)).withBorder(Borders.doubleLine()).setLayoutData(BorderLayout.Location.RIGHT)
        panel.addComponent(changingLabel)
        RefreshGrid()
    }).setRenderer(Button.FlatButtonRenderer()).withBorder(Borders.doubleLine("button title")).setVisible(true).setTheme(buttonTheme).setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Fill))
    val button3 = Button("test button 3", Runnable {
        //MessageDialog.showMessageDialog(textGUI, "Message", "holy moly guacamole 3");
        labelText = "button 3 has been pressed"
        grid3LabelText = if (grid3LabelText == "[___]") {
            "[_x_]"
        } else {
            "[___]"
        }
        panel.removeComponent(changingLabel)
        changingLabel = Label(labelText).setBackgroundColor(TextColor.RGB(22, 38, 46)).withBorder(Borders.doubleLine()).setLayoutData(BorderLayout.Location.RIGHT)
        panel.addComponent(changingLabel)
        RefreshGrid()
    }).setRenderer(Button.FlatButtonRenderer()).withBorder(Borders.doubleLine("button title")).setVisible(true).setTheme(buttonTheme).setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Fill))
    val button4 = Button("test button 4", Runnable {
        //MessageDialog.showMessageDialog(textGUI, "Message", "holy moly guacamole 4");
        labelText = "button 4 has been pressed"
        grid4LabelText = if (grid4LabelText == "[___]") {
            "[_x_]"
        } else {
            "[___]"
        }
        panel.removeComponent(changingLabel)
        changingLabel = Label(labelText).setBackgroundColor(TextColor.RGB(22, 38, 46)).withBorder(Borders.doubleLine()).setLayoutData(BorderLayout.Location.RIGHT)
        panel.addComponent(changingLabel)
        RefreshGrid()
    }).setRenderer(Button.FlatButtonRenderer()).withBorder(Borders.doubleLine("button title")).setVisible(true).setTheme(buttonTheme).setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Fill))
    val button5 = Button("test button 5", Runnable {
        //MessageDialog.showMessageDialog(textGUI, "Message", "holy moly guacamole 5");
        labelText = "button 5 has been pressed"
        grid5LabelText = if (grid5LabelText == "[___]") {
            "[_x_]"
        } else {
            "[___]"
        }
        panel.removeComponent(changingLabel)
        changingLabel = Label(labelText).setBackgroundColor(TextColor.RGB(22, 38, 46)).withBorder(Borders.doubleLine()).setLayoutData(BorderLayout.Location.RIGHT)
        panel.addComponent(changingLabel)
        RefreshGrid()
    }).setRenderer(Button.FlatButtonRenderer()).withBorder(Borders.doubleLine("button title")).setVisible(true).setTheme(buttonTheme).setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Fill))
    val button6 = Button("test button 6", Runnable {
        //MessageDialog.showMessageDialog(textGUI, "Message", "holy moly guacamole 6");
        labelText = "button 6 has been pressed"
        grid6LabelText = if (grid6LabelText == "[___]") {
            "[_x_]"
        } else {
            "[___]"
        }
        panel.removeComponent(changingLabel)
        changingLabel = Label(labelText).setBackgroundColor(TextColor.RGB(22, 38, 46)).withBorder(Borders.doubleLine()).setLayoutData(BorderLayout.Location.RIGHT)
        panel.addComponent(changingLabel)
        RefreshGrid()
    }).setRenderer(Button.FlatButtonRenderer()).withBorder(Borders.doubleLine("button title")).setVisible(true).setTheme(buttonTheme).setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Fill))
    val button7 = Button("test button 7", Runnable {
        //MessageDialog.showMessageDialog(textGUI, "Message", "holy moly guacamole 7");
        labelText = "button 7 has been pressed"
        grid7LabelText = if (grid7LabelText == "[___]") {
            "[_x_]"
        } else {
            "[___]"
        }
        panel.removeComponent(changingLabel)
        changingLabel = Label(labelText).setBackgroundColor(TextColor.RGB(22, 38, 46)).withBorder(Borders.doubleLine()).setLayoutData(BorderLayout.Location.RIGHT)
        panel.addComponent(changingLabel)
        RefreshGrid()
    }).setRenderer(Button.FlatButtonRenderer()).withBorder(Borders.doubleLine("button title")).setVisible(true).setTheme(buttonTheme).setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Fill))
    val button8 = Button("test button 8", Runnable {
        //MessageDialog.showMessageDialog(textGUI, "Message", "holy moly guacamole 8");
        labelText = "button 8 has been pressed"
        grid8LabelText = if (grid8LabelText == "[___]") {
            "[_x_]"
        } else {
            "[___]"
        }
        panel.removeComponent(changingLabel)
        changingLabel = Label(labelText).setBackgroundColor(TextColor.RGB(22, 38, 46)).withBorder(Borders.doubleLine()).setLayoutData(BorderLayout.Location.RIGHT)
        panel.addComponent(changingLabel)
        RefreshGrid()
    }).setRenderer(Button.FlatButtonRenderer()).withBorder(Borders.doubleLine("button title")).setVisible(true).setTheme(buttonTheme).setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Fill))

    subBottomPanel6.addComponent(button1)
    subBottomPanel6.addComponent(button2)
    subBottomPanel6.addComponent(button3)
    subBottomPanel6.addComponent(button4)
    subBottomPanel6.addComponent(button5)
    subBottomPanel6.addComponent(button6)
    subBottomPanel6.addComponent(button7)
    subBottomPanel6.addComponent(button8)
    bottomPanel.addComponent(subBottomPanel6.setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Fill)))


    //adding bottom panel to main panel
    panel.addComponent(bottomPanel.setLayoutData(BorderLayout.Location.BOTTOM))

    val keyStroke: KeyStroke = KeyStroke.getKeyStroke('g')


    // Create window to hold the panel
    val window = BasicWindow()
    window.component = panel.withBorder(Borders.doubleLine("Title Test"))
    window.title = "Hello World"
    window.setHints(listOf(Window.Hint.CENTERED, Window.Hint.FULL_SCREEN, Window.Hint.NO_POST_RENDERING));
    window.theme = basicTheme

    //val listener = WindowListenerAdapter().onInput(window, com.googlecode.lanterna.input.KeyStroke('g', false, false, false), AtomicBoolean(true))
    //window.addWindowListener(listener)



    // Create gui and start gui
    val gui = MultiWindowTextGUI(screen, DefaultWindowManager(), EmptySpace(TextColor.RGB(16, 22, 24)))
    gui.addWindowAndWait(window)

}