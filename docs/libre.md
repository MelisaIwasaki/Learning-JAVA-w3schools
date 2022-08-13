# Access Modifiers

> For classes, you can use either public or default:

| Modifier | Description |
| :-: | :-: |
| public | The class is accessible by any other class |
| default | The class is only accessible by classes in the same package. This is used when you don't specify a modifier. |

> For attributes, methods and constructors, you can use the one of the following:

| Modifier | Description |
| :-: | :-: |
| public | The code is accessible for all classes |
| private | The code is only accessible within the declared class |
| default | The code is only accessible in the same package. This is used when you don't specify a modifier. |
| protected | The code is accessible in the same package and subclasses |

![buho](https://user-images.githubusercontent.com/92184167/184501548-b9d3bc3f-527d-4848-800b-b6c97c391695.jpg)

# Non-Access Modifiers

> For classes, you can use either final or abstract:

| Modifier | Description |
| :-: | :-: |
| final | The class cannot be inherited by other classes |
| abstract | The class cannot be used to create objects (To access an abstract class, it must be inherited from another class) |

> For attributes and methods, you can use the one of the following:

| Modifier | Description |
| :-: | :-: |
| final | Attributes and methods cannot be overridden/modified |
| static | Attributes and methods belongs to the class, rather than an object |
| abstract | Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from) |
| transient | Attributes and methods are skipped when serializing the object containing them |
| synchronized | Methods can only be accessed by one thread at a time |
| volatile | The value of an attribute is not cached thread-locally, and is always read from the "main memory" |


![jijo](https://user-images.githubusercontent.com/92184167/184501572-8ef6b616-6266-4119-bf14-1b655b7e9fd4.jpg)

