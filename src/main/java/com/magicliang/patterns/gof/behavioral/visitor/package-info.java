/**
 * project name: design-patterns
 * <p>
 * description: 访问者模式
 * 访问者模式为了实现所谓的“双重分派”，设计了一个回调再回调的机制。因为Java只支持基于多态的单分派模式，这里强行模拟出“双重分派”反而加大了代码的复杂性。
 * 这个模式基于一个假定，一个复杂的容器需要一个复杂遍历的方法（不能简单地通过迭代器遍历）。只能提供一些内部类型供外部进行处理接口的设计。外部基于这几种
 * 处理接口设计一个复杂的访问者。如果有必要的话（很多时候没有这个必要），内部元素也需要有一个接纳访问者的模式（即所谓回调）。然后这个复杂的容器接纳访问
 * 者，由自己控制迭代流程。
 * 访问者模式和迭代器模式的重大区别是，到底迭代/遍历的流程是由内部控制的，还是外部控制的。
 * <p>
 * 实际上，Java标准库提供的Files.walkFileTree()已经实现了一个访问者模式：
 * <p>
 * public class Main {
 * public static void main(String[] args) throws IOException {
 * Files.walkFileTree(Paths.get("."), new MyFileVisitor());
 * }
 * }
 * <p>
 * // 实现一个FileVisitor:
 * class MyFileVisitor extends SimpleFileVisitor<Path> {
 * // 处理Directory:
 * public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
 * System.out.println("pre visit dir: " + dir);
 * // 返回CONTINUE表示继续访问:
 * return FileVisitResult.CONTINUE;
 * }
 * <p>
 * // 处理File:
 * public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
 * System.out.println("visit file: " + file);
 * // 返回CONTINUE表示继续访问:
 * return FileVisitResult.CONTINUE;
 * }
 * }
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:47
 */
package com.magicliang.patterns.gof.behavioral.visitor;