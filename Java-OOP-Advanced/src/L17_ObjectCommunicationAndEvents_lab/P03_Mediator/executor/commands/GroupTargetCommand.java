package L17_ObjectCommunicationAndEvents_lab.P03_Mediator.executor.commands;

import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.interefaces.AttackGroup;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.interefaces.Command;
import L17_ObjectCommunicationAndEvents_lab.P03_Mediator.interefaces.Target;

public class GroupTargetCommand implements Command {
    private AttackGroup attackGroup;
    private Target target;
    
    public GroupTargetCommand(AttackGroup attackGroup, Target target) {
        this.attackGroup = attackGroup;
        this.target = target;
    }
    
    @Override
    public void execute() {
        attackGroup.groupTarget(this.target);
    }
}
