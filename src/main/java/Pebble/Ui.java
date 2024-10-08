package pebble;

import java.util.ArrayList;

/**
 * Class that manages the user interface of the application.
 */
public class Ui {
    /**
     * Shows a message in both CLI and GUI.
     *
     * @param message The message to be displayed.
     * @return The message to be displayed on GUI.
     */
    public String showMessage(String message) {
        // Print the message to the command line
        System.out.println(message);
        // Return the message to be displayed in GUI
        return message;
    }

    /**
     * Shows a goodbye message.
     * @return The goodbye message to be displayed on GUI.
     */
    public String showGoodbye() {
        return showMessage("Goodbye! Hope to see you again soon!");
    }

    /**
     * Shows the entire task list
     * @param tasksList Task list to be displayed.
     * @return The message to be displayed on GUI.
     */
    public String showTasksList(ArrayList<Task> tasksList) {
        int tasksListSize = tasksList.size();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Here are the tasks in your list:\n");
        for (int i = 0; i < tasksListSize; i++) {
            stringBuilder.append(tasksList.get(i)).append("\n");
        }
        return showMessage(stringBuilder.toString());
    }

    public String showMarkTask(Task task) {
        return showMessage("Nice! I've marked this task as done:\n" + task);
    }

    public String showUnmarkTask(Task task) {
        return showMessage("OK, I've marked this task as not done yet:\n" + task);
    }

    /**
     * Shows a message when a task is added.
     *
     * @param task The task that was added.
     * @param size The updated size of the tasks list.
     * @return The message to be displayed on GUI.
     */
    public String showAddTask(Task task, int size) {
        return showMessage("Got it. I've added this task:\n" + task
                + "\nNow you have " + size + " tasks in the list.");
    }

    /**
     * Shows a message when a task is deleted.
     *
     * @param task The task that was deleted.
     * @param size The size of the tasks list.
     * @return The message to be displayed on GUI.
     */
    public String showDeleteTask(Task task, int size) {
        return showMessage("Noted. I've removed this task:\n"
                + task + "\nNow you have " + size + " tasks in the list.");
    }

    /**
     * Shows a message when an error has occurred
     *
     * @return The error message to be displayed on GUI.
     */
    public String showError(String errorMessage) {
        return showMessage("Error: " + errorMessage);
    }
}
