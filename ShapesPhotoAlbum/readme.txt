Homework 9 Shapes Photo Album pt 2:Controller Views
The Shapes Photo Album Part 2
In this assignment will implement two views for your model from the last assignment.A view is responsible for rendering
(some or all of)the data in a model in a form that is understandable to whoever is actually trying to use the data.
YOU HAVE TWO WEEKS for this assignment.Don't wait until the last minute to start.
Carrying forward and refactoring
If you made good use of abstraction and was mindful of the "separation of concerns"as we have discussed in lecture this
semester,there should be minimal refactoring required for your model.This week,you may need to adjust or add a few
things but if you've adhered to the SOLID principles and isolated your model design,those changes should be minimal.
Please document what changes you make and the reason for each change in your README.
This assignment requires you to self-learn some things,so don't wait until the last minute to get started.You are also
free to leverage code that we've used in class to help "jump start"your efforts,especially when developing your views.
UML diagrams are NOT required for this assignment submission (although you are welcome to create them for your
own design process)
Views
In this assignment you will work on two views for your Shapes Photo Album application -an interactive "Graphical"view
and a static "Web"view.Yes,we know:both views are graphical in one sense of the word,but for this assignment we are
distinguishing between a(nearly)native interactive graphical application from a static web page using html markup and
SVG.
As with the model,in the abstract sense,a view is an interface;particular concrete views implement that interface.
Accordingly,your work in this assignment should carefully distinguish between any one particular implementation of a
view and the common interface to which they should all adhere.(Side note:if your model from the previous assignment
failed to have a similar interface/implementation split,you should fix that also).

Views
In this assignment you will work on two views for your Shapes Photo Album application-an interactive "Graphical"view
and a static"Web"view.Yes,we know:both views are graphical in one sense of the word,but for this assignment we are
distinguishing between a(nearly)native interactive graphical application from a static web page using html markup and
SVG.
As with the model,in the abstract sense,a view is an interface;particular concrete views implement that interface.
Accordingly,your work in this assignment should carefully distinguish between any one particular implementation of a
view and the common interface to which they should all adhere.(Side note:if your model from the previous assignment
failed to have a similar interface/implementation split,you should fix that also).
Note:both the Web view(SVG)and the Graphical view (Swing)use a coordinate system that stipulates the origin is in
the upper left corner of the "frame"/window.The command input files we provide (more info below)default to this
coordinate system.If you prefer to use your own coordinate origin(e.g.0,0 in the center of the screen like Python Turtle)
you'll need to write your own code to do the coordinate transformation.
View interface(s)
Start by planning your views,and observing which operations you need.Although different views look and behave
differently,there are some common aspects to all views.The design of the actual interface(s)is left up to you.A
common design technique is to have a view interface that has all functionalities and then individual views suppress or
provide defaults for functionalities they do not implement.Another relevant design rule is from the SOLID principles:
Interface Segregation(No client should be forced to depend on methods that it does not use).Think about these aspects
as you come up with a design for your views.
Both views support the concept of displaying "snapshots"with the unique identifier and optional descriptive text that is
included with those snapshots.


In this view, you will draw the photo album snapshots inside of a window, one snapshot at a time. You must have interactive buttons that allow the user to:
• View the snapshot information (unique id and description)
• "page forward" and show the next snapshot if it exists. If no further snapshots exist, a message to the user should indicate that
• "page backward" and show the previous snapshot, if there is a previous one, If there is no "previous" a message to the user should be shown
• "jump" to a snapshot the user explicitly selects from a list of options
An example is below. You are free to be creative in your placement of Ul elements as long as you provide equivalent functionality (e.g. perhaps your navigation buttons are graphical and placed on the left hand side of the window)


1.2 Implementation Details
To implement this view, you will need to use Java Swing. (As some of you saw in one of our lectures, Java's other GUI library, deploying JavaX is overly complicated for our purposes.) The code provided from lecture will give you a basic beginning using Swing. Some hints:
• You will likely need to look up documentation on Graphics class
• Here are links to documentation on Panels E and Frames D.
• Creating a simple dialog (as I did) is easy and quick - see some documentation here E›
• Swing defines three template methods by which you can customize the size of panels or frames: getMinimumSize, getPreferredSize and getMaximumSize. Of these, the most common to override is getPreferredSize.
• Normally a GUI draws itself whenever it is asked to, or when certain events occur (e.g. maximizing or resizing the window). In order to update a pane with a new snapshot, consider using the repaint method when you have everything in place.



1.3
Behavior of the graphical view
The photo album should display the first snapshot your application reads from the file, with no additional inputs from the user. The window should be large enough to show the snapshots we produce, but if in doubt, you are free to use a scroll pane if you wish. See JScrollPane Bfor details.
If objects overlap during the creation of the "photo", they should be drawn in the order in which they were created (specified as input).
2 Web View
The "graphical" view handles user events and gives a richer UX (user experience) than plain-txt or a static web page. However, to explore the possibilities of using your model with more than one type of view, you'll also create a "web" view for this assignment. As discussed in lecture, this view is essentially static html markup with a bit of embedded SVG to draw the graphics required.
For this view, there is no need to concern yourself with creating new tabs, changing "pages", or other interactive activities. Instead, you may create one (possibly long) html document that delimits each snapshot in some way so we can distinguish where snapshots begin and end.
In this view, you will produce a textual output (file) of the photo album. The file you produce should be proper (but simple) HTML with embedded SVG. The SVG file format is an XML-based format that can be used to describe images (and animations). It is an example of "vector-based graphics" where it stores explicitly the shapes to be drawn and manipulations to be done on them, instead of pixel values. Most browsers support SVG rendering.
If you have particular questions, you can read the official SVG documentation B to learn more about this format. You will find the descriptions on shapes G_particularly relevant.
Again, remember that since SVG is an XML-based format, it is a purely text representation.




Organization
1. In addition to creating the two views described, should should have a simple Controller that manages and coordinates information flow between the model and view (particularly the "graphical" view).
2. Follow good packaging and testing practices. Your model should be in a separate package from your controller (in its own package) and views (in their own package)
3. Create other packages as needed for utility classes, etc. as you see fit.
4 Reading from files
You might have questioned how the data for our photo album gets passed to your application. Essentially, your application will read from a text file that gives a list of sequential commands that your model should execute. Those commands are then "visualized" as your views render the model. Here is an example command file (it's included for download as well)
# Make a rectangle and oval. Color red and green
shape
myrect
rectangle
200 50
225510
# Takeapshot Shter Pirst
Optional description text follows snapshot command
selfie
meseze mere
myrect
move myrect
300
25
100
200
100
300
# Take another snapshot. Again, optional description included
# Snapshot descriptions go up to the end of the line (no multi-line descriptions to worry about)
snapShot 2nd selfie
# Chante rectangle color to blue. Move the oval
move myoval
500
400
# Another
snapshot. This time, descriptive text is omitted.
snapShot
# Remove the rectangle, then take one more snapshot
remove myrect
snapshot Selfie after removing the rectangle from the picture
First, understand that the # character at the beginning of any line is a comment. Your code can effectively skip over lines with # Command set:
• shape: Creates a new shape. Followed by these attributes:
ID - textual name for the shape
Type - type of shape (only rectangles and ovals for this assignment) x position - coordinate system for both Swing and SVG starts in upper left corner y position - coordinate system for both Swing and SVG starts in upper left corner width - or "first dimension" like radius_x. for ovals height - or "second dimension" like radius_y for ovals red - RGB red value green - RGB green value blue - RGB blue value
• move: Moves a shape to a new x, y position
ID - text name for the shape
x position - coordinate system for both Swing and SVG starts in upper left corner y position - coordinate system for both Swing and SVG starts in upper left corner
• color: Changes the color of a shape red - RGB red value green - RGB green value blue - RGB blue value



resize: Resizes the shape
width - or "first dimension" like radius_x. for ovals height - or "second dimension" like radius_y for ovals
• remove: Removes the shape
ID - text name for shape to remove
• snapshot: Tells the model to take a snapshot of the current state of the album
description (optional) - optional text that the command file can use to tag the snapshot with extra information
Starter Command Files for your testing: demo input.txt ~ buildings.txt ~
Important Note: Your Model should NOT be a command file reader. SOLID. If I give migrate the command file schema and contract another team to create a new file reader, I should still be able to load your model with commands, assuming my new file reader uses your model's existing interface.
5 The main() method
As we discussed in class, your entry-point for the application should be brief, handing most of the control over to your MVC triad
public class PhotoAlbumMain {
public static void main (String[] args) t
// FILL IN HERE
}
This main () method will be the entry point for your program. Your program needs to take inputs as command-line arguments (available in your program through the argument args above). Review the documentation for command-line arguments in a Java program B
The command-line arguments will be of the form below (arguments delimited by lI are optional, depending on the command line options);
-in "name-of-command-file" -view "type-of-view" [-out "where-output-should-go"] [xmax] [ymax]
-view and -v are synonymous. Your program should support both command line "switches".
The xmax and ymax are optional integers that specify the bounds of the "view window". If these attributes are not specified, a default value of 1000 is used for both x (width) and y (height). Also note that the "where output should go" is only relevant for the HTML view, so it is optional (and ignored) for the Graphical (Swing) view.
Two examples:
My Program -in buildings.txt -out myWeb.html -v web
My Program -in buildings.txt -v graphical 800 800
Characteristics of a valid input are:
• Each pair of arguments (-in "input-file"), (-out "output-file", etc.) may appear in any order (e.g. the -view pair can appear first, followed by
-in and so on)
• Each pair of arguments are ordered. That is, if the user types -in then the next input must be the name of an input file, and so on.
• Providing an input file (the -in pair) and a view (the -view pair) are mandatory. If the output set is not specified and the view needs it, gracefully exit the program with an error message indicating why the program did not run..



6 Specifying command-line arguments through Intelli
You need to create an Application run configuration that chooses PhotoAlbumMain as its main class. In this run configuration, you can also specify command-line arguments. When you run the program normally, it will use these command-line arguments.
7 Testing
You should be able to test your HTML view sufficiently by parameterizing it over alternate input and output sources. We did the same thing in the console controller lab so follow that approach if you have questions.
Unit-testing the graphical view is optional.
Submission
• Submit any files created or modified in this assignment. We should be able to run your program successfully using files in your submission.
• Submit a text README file explaining your design. Make sure you explain your design changes from the previous assignment.
• Submit a file named buildings0ut.html, containing the HTML + SVG for buildings.txt
• Submit a JAR file (with extension jar ) file that can run your program - see below for instructions. Your HTML file, JAR file and README document should be placed in a directory called resources/.
To create a JAR file, do the following:
• Go to File -> Project Structure -> Project Settings -> Artifacts
• Click on the plus sign
• Choose
JAR
-> From Modules with dependencies. You should now see something like this:



• If you see a checkbox labelled "Build on make", check it.
• Hit ok
• You should now see something like
+-眉
* shape_photoalbum:jar
Name:
Project Structure
shape_photoalbum jar
Project Settings
Project
Modules
Libraries
Output directory:
022_SPRING_ON-SITE/Homework/s
• Include in project build
Facets
Artifacts
Output Layout
Pre-processing
Post-processing
土
If now you see a checkbox labeled "Build on make," or "Include in project build," (it's been renamed in recent versions of IntelliJ) check it now.
You can also explicitly build the artifacts for the jar as described next
• Make your project (click the button to the left of the run configurations dropdown, with the ones and zeros and a down-arrow on it). Your
• jar file should now be in ‹projectRoot>/out/artifacts/. Alternatively (if you didn't check "Build on Make") select the Build menu and choose Build Artifacts.
Build
Run
Tools
V
Build Project
Build Module
Rebuild
Recompile
₫ F9
V
公第F9
+ 86 F9
Rebuild Project
V
Build Artifacts...
Run Ant Target
out artifacts shape_photoalbum_jar
Il shape_drahjar
production shape_draw
test
• ₴6 F10
• Verify that your jar file works. To do this, copy the jar file and your command input files to a common folder. Now open a command-prompt/terminal and navigate to that folder. Now type java -jar NameOfJARFile. jar -in demo_input.txt -view web -out out.html and press
ENTER. The program should behave accordingly. If instead you get errors, review the above procedure to create the JAR file correctly. Note that double-clicking on your JAR file will not test it correctly, because your program is expecting command-line arguments.
Grading standards
For this assignment, you will be graded on
• the design of your view interface, in terms of clarity, flexibility, and how well it supports needed functionality;
• how well you justify any changes made to your model,
• the correctness and stylishness of your implementation
• whether your program accepts command-line arguments correctly
• whether your JAR file works correctly
• the comprehensiveness and correctness of your test coverage.
8 Future work (things to do in your copious free time this summer)
This section is NOT part of the assignment you're submitting. It's included here to help you think through some possible enhancements to our program.
After you finish the core assignment, you can continue to build on this application to hone your OOD/OOP skills (and add to your portfolio). Ski Ratings included for free! e



8 Future work (things to do in your copious free time this summer)
This section is NOT part of the assignment you're submitting. It's included here to help you think through some possible enhancements to our program.
After you finish the core assignment, you can continue to build on this application to hone your OOD/OOP skills (and add to your portfolio). Ski Ratings included for free! ®


Create a swing-based view to inspect the text of the command set that was rendered, and allow the user to toggle views

Same as above, but make the view editable so users can change the command set, save the file and reprocess the image

Enhance your graphic view to support editing the model graphically (e.g. moving shapes with the mouse, etc.)

Same as above, with full functionality to create shapes, reprocess the model in memory, and save the changed model



