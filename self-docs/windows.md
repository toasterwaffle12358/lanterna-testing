# windows
In this file you can find more in depth examples on how to use and customize windows. 



## creating a window
add this line to your code in order to create a window
~~~
val window = BasicWindow()
~~~
your window should be created at the end of your code, but before the creation of the GUI


## changing the title of a window
here is the code for adding a title to your window, the window title can be customized to your liking.
~~~
window.title = "Example window title"
~~~
this line should be placed after the creation of the window (but before the creation of the GUI)


## adding a component to your window 
~~~
window.component = panel
~~~
in its most basic form, adding a panel to your window can look like this, however just like with adding elements to a panel, you can customize their look and give them a border. \
adding a panel and giving it a border looks like this:
~~~
window.component = panel.withBorder(Borders.doubleLine("Title Test"))
~~~
in this example we added a panel, gave it a double line border, and gave the border the title "Title Test"
more information on borders can be found in the [borders](borders.md) file.

## window hints
window hints are an expansive way to customize the look of your window. detailed information on window hints can be found [here (javadoc)](http://mabe02.github.io/lanterna/apidocs/3.0/com/googlecode/lanterna/gui2/Window.Hint.html)
heres an example of how to use them:
~~~
window.setHints(listOf(Window.Hint.CENTERED, Window.Hint.FULL_SCREEN, Window.Hint.NO_POST_RENDERING));
~~~
(note: "Window.Hint.NO_POST_RENDERING" is what removes the shadow from behind a window by default)
in this example I centered the window on the screen, made the window take up the full screen, and then removed the shadow from behind the window. \
there are more window hints than the ones shown above, and information on what they do can be found in the javadoc link provided.

## theming a window
theming a window is just the same as giving a theme to anything else, it can be done as follows:
~~~
window.theme = exampleTheme
~~~
more information on themes can be found [here](themes.md)

[back to main page](docs-index.md)
