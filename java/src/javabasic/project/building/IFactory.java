package javabasic.project.building;

public interface IFactory {
	
	public abstract String  getMachineName(); // 기계 이름 반환한다
	public abstract int  getMachineNum(); // 기계 수를 반환한다 
	public abstract boolean  isMachineAuto(); // 자동화 기계 여부 반환한다
}
