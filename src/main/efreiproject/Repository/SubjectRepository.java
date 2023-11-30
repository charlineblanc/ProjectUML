public class SubjectRepository implements ISubjectRepository{
    private static SubjectRepository repository = null;
    private List<Subject> subjectDB = null;

    private SubjectRepository(){subjectDB = new ArrayList<Subject>();}

    public static SubjectRepository getRepository(){
        if (repository==null){
            repository = new SubjectRepository();
        }
        return repository;

    }
    @Override
    public Subject create(Subject Subject){
        boolean success = subjectDB.add(subject);
        if (success)
            return subject;
        else
            return null;    

    }
    @Override
    public Subject read(String subjectCode){
        Subject subject = subjectDB.stream()
        .filters(s -> s.getSubjectCode().equals(subjectCode))
        .findAny()
        .orElse(null);
    return subject;

    }
    @Override
    public Subject update(Subject newSubject){
        Subject OldSubject = read(newSubject.getSubjectCode());
        if (OldSubject == null)
            return null;
        boolean success = delete(newSubject.getSubjectCode());
        if (success){
            boolean successAdded = subjectDB.add(newSubject);
            if (successAdded)
                return newSubject;
            else
                return null;
        }    
        return null;
    }

    @Override
    public boolean delete(String subjectCode){
        Subject subjectToDelete = read(subjectCode);
        boolean success = subjectDB.remove(subjectToDelete);
        return success;
    }

    @Override
    public List<Subject> getAll(){ return subjectDB;}
    
}
