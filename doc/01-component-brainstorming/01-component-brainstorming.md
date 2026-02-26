# Portfolio Part 1: Component Brainstorming

- **Name**: Reyhan Can
- **Dot Number**: can.22
- **Due Date**: 02/06/2026


## Pre-Assignment

> Before you jump in, we want you to take a moment to share your interests
> below. Use this space to talk about your career goals as well as your personal
> hobbies. These will help you clarify your values before you start
> brainstorming. Plus it helps us get to know you better! Feel free to share
> images in this section.

As I have always enjoyed designing and contemplating user experiences, I am motivated by learning more about how APIs function and how systems send messages to one another to prepare me to create applications that blend back-end programming with both clean and intentional design. My long-term objective is to work within_application and web design and develop my design knowledge through this project by continuing to strengthen my knowledge of component design; as well as creating something that supports my ultimate desire to work in developing or designing new software applications.



### Component Designs

> Please use this section to share your designs.

- Component Design #1: APIRequestQueue
  - **Description**:
    Manages API requests with priorities so the most important requests can be processed first. This models how apps/services schedule network calls.
  - **Kernel Methods**:
    void addRequest(Request r, int priority)
    Request removeNext()
    Request next()
  - **Secondary Methods**:
    int size()
    boolean contains(Request r)
    void clear()
    void changePriority(Request r, int newPriority)

  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:

      - Yes. Since it inherits from Standard, methods like clear, newInstance, and transferFrom mutate this.

    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:

      - Yes, it can possibly depend upon another internal helper class organize data more clearly.

    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      - Not necessarily. There is no need for enums or constants in the main operation.

    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:

      - Yes. To implement the secondary methods, kernel methods will be used. For instance, the contains method can remove the elements, check if a certain value exists, and finally restore the state using the kernel methods.


- Component Design #2: ScreenNavigationStack
  - **Description**:
    Models navigation in an app: each time you open a new screen, it gets pushed on top; “back” pops the current screen.
  - **Kernel Methods**:
    void push(Screen s)
    Screen pop()
    Screen top()
  - **Secondary Methods**:
   int size()
   boolean isEmpty()
   void clear()
   boolean contains(Screen s)
  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):

    - Would this component be mutable? Answer and explain:

      - Yes. The `contains` method can be implemented by temporarily popping pop elements off using `pop()` evaluate each screen, and then push them And gets back in order to restore previous structure.

    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
     -  No it can store screen object directly with no needing any internal helper type.

    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      - No. This component does not require any enums or constants. The contains method only compares elements and restores the structure.

    - Can you implement your secondary methods using your kernel methods?
      - Answer, explain, and give at least one example:
      - Yes contains can pop items into a temp stack using pop(), check each item, then with push() them back to restore in original order.

- Component Design #3: UIComponentTree
  - **Description**:
    - A tree is a data structure where a user interface is defined where a particular interface component has child components. This data structure is an exercise in modeling a real-world user interface construct in a tree data structure.

  - **Kernel Methods**:
    void addChild(UIComponent c)
    UIComponent removeChild(int index)
    int numberOfChildren()


  - **Secondary Methods**:
    UIComponent findById(String id)
    int height()
    boolean containsId(String id)
    void clear()

  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
      Yes. The structure changes when the children are added or removed, and methods such as clear in the Standard library also change this.

    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:

      - Possibly. An internal Node data structure might be useful for parent and child relationships.

    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:

      - Not necessarily. The core functionality of this component does not require enums or constants.

    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:

      - Yes. The kernel methods can be used to implement the secondary methods. For example, the height() method can be implemented using a recursive traversal of the tree. It can leverage numberOfChildren() in order to check if a node has children, and removeChild / addChild in order to descend into subtrees. The total height can be computed by computing the maximum height among all subtrees of children and adding 1

## Post-Assignment

The following sections detail everything that you should do once you've
completed the assignment.


# Changelog

## 2026.02.06

### Added

- Designed an APIRequestQueue component
- Designed a ScreenNavigationStack component
- Designed a UIComponentTree component
```


[example-components]: https://therenegadecoder.com/code/the-never-ending-list-of-small-programming-project-ideas/
[markdown-to-pdf-guide]: https://therenegadecoder.com/blog/how-to-convert-markdown-to-a-pdf-3-quick-solutions/
[survey]: https://forms.gle/dumXHo6A4Enucdkq9
