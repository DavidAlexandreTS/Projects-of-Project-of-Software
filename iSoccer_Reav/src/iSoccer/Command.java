package iSoccer;

import java.util.ArrayList;

public interface Command
{
	void execute(ArrayList<Worker> workers);
}
