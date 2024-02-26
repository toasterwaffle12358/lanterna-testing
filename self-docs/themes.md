# theming

## creating a theme
in lanterna, you can customize the default appearance of elements using themes, create a theme at the very top of the main function like this:
~~~
val exampleTheme = SimpleTheme.makeTheme(false, TextColor.RGB( 235, 232, 200 ), TextColor.RGB(14, 21, 24), TextColor.RGB(14, 21, 24), TextColor.RGB(14, 21, 24), TextColor.RGB( 235, 232, 200 ), TextColor.RGB(14, 21, 24), TextColor.RGB(14, 21, 24))
~~~
in this example theme we gave certian rbg colors to the foregrounds and backgrounds of our elements

here is what each argument in the code above does:
1. boolean to decide whether active components should use the bold SRG style. (selected elements will use bold text)
2. base foreground color.
3. base background color.
4. foreground color for editable components (eg: text input boxes)
5. background color for editable components
6. foreground color for selected components (eg: buttons the user is currently hovering on)
7. background color for selected components
8. background color of the gui

multiple themes can be created and used within the same project.

## applying a theme
to apply a theme, just take the element you wish to apply the theme to, and add a ".theme = exampleTheme" to the end. heres an example:
~~~
window.theme = exampleTheme
~~~
a theme will carry on to the children of a component, so if a panel is put inside of this window, it will also inherit the theme.
you can also apply a theme during the creation of a component. here is an example of that:
~~~
val button1 = Button("test button 1", Runnable {}).setTheme(exampleTheme)
~~~
in this example, we created a button, and gave it a theme by adding .setTheme(theme_name) to the end. \
some elements (such as buttons) are ok with setting a theme during their creation, however others (such as panels) will only accept the first method 
of setting a theme. this is because setting a theme during creation changes an element from its specific type, to the general "component" type, which cant be used in the same way.
because of this, the code below would also not work, because button1 is no longer of type "Button"
~~~
val button1: Button = Button("test button 1", Runnable {}).setTheme(exampleTheme)
~~~

