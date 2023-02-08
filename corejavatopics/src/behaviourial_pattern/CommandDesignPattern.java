package behaviourial_pattern;

import java.util.ArrayList;
import java.util.List;

interface Command {
	   public void execute();
	}
	class DrawCircle implements Command {
	    private ShapeDrafter drafter;
	  
	    public DrawCircle(ShapeDrafter drafter){
	        this.drafter = drafter;
	    }
	  
	    public void execute(){
	        drafter.drawCircle();
	    }
	}
	class DrawRectangle implements Command {
	    private ShapeDrafter drafter;
	  
	    public DrawRectangle(ShapeDrafter drafter){
	        this.drafter = drafter;
	    }
	  
	    public void execute(){
	        drafter.drawRectangle();
	    }
	}

	class ShapeDrafter {
	    public void drawRectangle(){
	        System.out.println("Drawing a Rectangle on Screen");
	    }
	  
	    public void drawCircle(){
	        System.out.println("Drawing a Circle on Screen"); 
	    }
	}

	class CommandInvoker {
	    private List<Command> commandList = new ArrayList<Command>();
	  
	    public void addCommand(Command c){
	        commandList.add(c);
	    }
	  
	    public void executeCommands(){
	        for(Command c : commandList){
	            c.execute();
	        }
	    }
	}
	class CommandDesignPattern {
	    public static void main(String args[]){
	        ShapeDrafter drafter = new ShapeDrafter();
	  
	        Command rectangleCommand = new DrawRectangle(drafter);
	        Command circleCommand = new DrawCircle(drafter);
	  
	        CommandInvoker invoker = new CommandInvoker();
	        invoker.addCommand(circleCommand);
	        invoker.addCommand(rectangleCommand);
	      
	        invoker.executeCommands();
	    }
	}