# borders

## adding a border to your element
when adding an element to its parent, you can add a border. heres an example process would look like without adding a border
~~~
panel.addComponent(label1)
~~~
heres what it would look like with a border
~~~
panel.addComponent(label1.withBorder(Borders.singleLine()))
~~~
you can also add a border during the creation of an element, however in my testing, some types dont like it (panels).
heres what that would look like:
~~~
val label1 = Label("label text goes here").withBorder(Borders.doubleLine())
~~~
adding a border during the creation of an element will change it to datatype "Border!", and it may function in unintended ways.
for example, adding a border during the creation of a panel will mean that children can no longer be added to the panel, because it is actually of type Border!
it is best to add a border when adding the element to its parent.

## border types
there are multiple types of borders in lanterna. here are the names of each and what they look like
