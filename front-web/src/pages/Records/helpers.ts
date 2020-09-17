import instant from 'moment';

export const formatDate = (date: string) => {
  return instant(date).format('DD/MM/YYYY HH:mm');
}