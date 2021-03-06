package L17_ObjectCommunicationAndEvents_lab.P04_Observer.logger;


import L17_ObjectCommunicationAndEvents_lab.P04_Observer.enumeration.LogType;

public class CombatLogger extends BaseLogger {
    public CombatLogger() {
    }
    
    @Override
    public void handle(LogType type, String message) {
        if (type == LogType.ATTACK || type == LogType.MAGIC) {
            System.out.println(type.name() + ": " + message);
        }
        else {
            if (super.getSuccessor() != null){
                super.getSuccessor().handle(type, message);
            }
        }
    }
}
